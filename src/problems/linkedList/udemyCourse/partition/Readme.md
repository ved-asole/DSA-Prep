# Partition

Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.

### Example 1:

    Input:
    5
    1, 9, 5, 10, 2
    4
    
    Output : 
    2 -> 1 -> 9 -> 5 -> 10

    Explanation :
    All the elements less than 4 will be added to the start of the linked list with larger elements at last.

## Your Task:
- You don't have to read input or print anything. Your task is to complete the function partition() which takes the LinkedList `ll` and number `x`.

### Expected Time Complexity: O(n)
### Expected Auxiliary Space: O(1)