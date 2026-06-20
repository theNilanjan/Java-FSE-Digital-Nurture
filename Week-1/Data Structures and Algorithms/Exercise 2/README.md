# Exercise 7: Financial Forecasting Using Recursion

## Objective
To develop a financial forecasting tool using recursion to predict future values based on historical growth rates.

## Scenario
Financial forecasting is used to estimate future investment values based on current value and expected growth rate. This exercise demonstrates how recursion can be used to perform compound growth calculations.

## Features
- Recursive implementation of financial forecasting
- Future value prediction based on:
  - Present Value
  - Growth Rate
  - Number of Years
- Analysis of recursive algorithm complexity

## Formula Used

Future Value = Present Value × (1 + Growth Rate)^Years

## Recursive Approach

### Base Case
When the number of years becomes 0, return the present value.

### Recursive Case
Apply the growth rate and recursively calculate the value for the remaining years.

## Complexity Analysis

### Time Complexity
O(n)

where n is the number of years.

### Space Complexity
O(n)

due to recursive call stack usage.

## Optimization
The recursive solution can be optimized using:

1. Iterative approach
2. Mathematical formula using `Math.pow()`

Both approaches reduce memory overhead and improve performance.

## Conclusion
The recursive algorithm successfully predicts future values and demonstrates the practical use of recursion in financial forecasting problems.
