# Valid Parentheses - Leetcode 20

Given a string s containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.
        

Example 1:

    Input: s = "()"
    Output: true

Example 2:

    Input: s = "()[]{}"
    Output: true

Example 3:

    Input: s = "(]"
    Output: false


Constraints:

-    1 <= s.length <= 104
-    s consists of parentheses only '()[]{}'.
     
## Your Task:

You only need to complete the function `isValid()` that takes s as parameter and returns if the string has valid parentheses.

### Expected Time Complexity: O(|S|).

### Expected Auxiliary Space: O(1).