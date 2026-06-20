# Exercise 3: Stored Procedures

## Objective

To understand and implement PL/SQL Stored Procedures for automating banking operations.

## Scenarios Implemented

### Scenario 1: Process Monthly Interest

A stored procedure named `ProcessMonthlyInterest` is created to calculate and apply 1% monthly interest to all savings accounts.

### Scenario 2: Update Employee Bonus

A stored procedure named `UpdateEmployeeBonus` is created to update employee salaries by applying a bonus percentage to all employees within a specified department.

### Scenario 3: Transfer Funds

A stored procedure named `TransferFunds` is created to transfer money between accounts. The procedure verifies that the source account has sufficient balance before performing the transfer.

## Concepts Used

* Stored Procedures
* Procedure Parameters
* UPDATE Statements
* Conditional Statements (IF-ELSE)
* Transaction Control (COMMIT)
* DBMS_OUTPUT.PUT_LINE
* Data Validation

## Files

* `Exercise3.sql` – Contains all stored procedure implementations.
* `README.md` – Documentation for the exercise.

## Conclusion

This exercise demonstrates how stored procedures can automate recurring banking operations, improve code reusability, and enforce business rules directly within the database.
