package com.sebi.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpensetrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensetrackerApplication.class, args);
	}

    // Add this import at the top if it's missing:
    // import org.springframework.boot.CommandLineRunner;
    // import org.springframework.context.annotation.Bean;

    @org.springframework.context.annotation.Bean
    org.springframework.boot.CommandLineRunner commandLineRunner(ExpenseRepository repository) {
        return args -> {
            // Create some dummy data on startup
            repository.save(new Expense("Morning Coffee", 15.00));
            repository.save(new Expense("Gym Membership", 150.00));
            repository.save(new Expense("Shawarma", 35.00));
        };
    }
}
