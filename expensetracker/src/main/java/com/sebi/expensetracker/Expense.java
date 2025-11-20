package com.sebi.expensetracker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Spring: "Make a table in the database for this"
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID (1, 2, 3...)
    private Long id;

    private String description; // e.g., "Coffee"
    private Double amount;      // e.g., 15.50

    // Empty Constructor (Required by Spring)
    public Expense() {
    }

    // Constructor used to create new expenses
    public Expense(String description, Double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Getters (so we can read the data)
    public Long getId() { return id; }
    public String getDescription() { return description; }
    public Double getAmount() { return amount; }
}