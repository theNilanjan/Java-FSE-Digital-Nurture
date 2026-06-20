# Exercise 2: E-commerce Platform Search Function

## Objective
To implement and analyze Linear Search and Binary Search algorithms for searching products in an e-commerce platform.

## Scenario
An e-commerce platform requires an efficient search functionality to quickly locate products from a large catalog. This exercise demonstrates the implementation and comparison of Linear Search and Binary Search algorithms.

## Features
- Product class with attributes:
  - Product ID
  - Product Name
  - Category
- Linear Search implementation
- Binary Search implementation
- Performance comparison using Big O notation

## Algorithms Used

### Linear Search
Searches each product sequentially until the target is found.

**Time Complexity**
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

### Binary Search
Searches a sorted array by repeatedly dividing the search space in half.

**Time Complexity**
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

## Conclusion
Binary Search is more efficient for large product datasets because it significantly reduces the number of comparisons required to locate a product.
