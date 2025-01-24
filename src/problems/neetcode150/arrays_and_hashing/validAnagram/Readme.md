# Valid Anagram - [LeetCode 242](https://leetcode.com/problems/valid-anagram)

Given two strings `s` and `t`, return true if t is an anagram of `s`, and false otherwise.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

### Example 1:

    Input: s = "anagram", t = "nagaram"

    Output: true


### Example 2:

    Input: s = "rat", t = "car"

    Output: false


### Constraints:

-    1 <= s.length, t.length <= 5 * 10^4
-    `s` and `t` consist of lowercase English letters.


**Follow up:** What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

### Recommended Time & Space Complexity:
You should aim for a solution with `O(n + m)` time and `O(1)` space, where `n` is the length of the string `s` and `m` is the length of the string `t`.


### Solution Performance: 

#### [Check here](https://leetcode.com/problems/valid-anagram/submissions/1515792686)

![Performance](performance.png)