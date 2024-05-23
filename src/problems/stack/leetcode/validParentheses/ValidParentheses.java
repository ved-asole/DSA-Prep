package problems.stack.leetcode.validParentheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();

        for (char i : charArray) {
            if (stack.empty() || i == '{' || i ==  '[' || i == '(') stack.push(i);
            else if (
                    (i == '}' && stack.peek() == '{') ||
                            (i == ']' && stack.peek() == '[') ||
                            (i == ')' && stack.peek() == '(')
            ) stack.pop();
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        System.out.println(isValid(s));
    }
}