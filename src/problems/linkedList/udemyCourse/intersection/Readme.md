# Intersection

Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.

### Example 1:

    Input:
    4
    3 1 5 9
    3
    2 4 6
    3
    7 2 1
    
    Output : 
    7

    Explanation :
    The common intersection of both the linked lists is at Node with value 7

## Your Task:
- You don't have to read input or print anything. Your task is to complete the function findIntersection() which takes the LinkedList `llA` and LinkedList `llB`.

### Expected Time Complexity: O(n)
### Expected Auxiliary Space: O(1)