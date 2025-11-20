package com.sebi.expensetracker;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/expenses") // This means the URL will be localhost:8080/expenses
public class ExpenseController {

    private final ExpenseRepository repository;

    // Dependency Injection: Spring gives us the repository automatically
    public ExpenseController(ExpenseRepository repository) {
        this.repository = repository;
    }

    // 1. GET method to see all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    // 2. POST method to add a new expense
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return repository.save(expense);
    }

    // 3. DELETE method to remove an expense by ID
    // URL will be: DELETE localhost:8080/expenses/3
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        repository.deleteById(id);
    }
}