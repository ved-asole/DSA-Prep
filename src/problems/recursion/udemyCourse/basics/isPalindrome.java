package problems.recursion.udemyCourse.basics;

import java.util.Arrays;

public class isPalindrome {

    // Problem : Write a recursive function called isPalindrome which returns true if the string passed
    // to it is a palindrome (reads the same forward and backward). Otherwise it returns false.

    public static void main(String[] args) {
        for (String s : Arrays.asList(
                "awesome", "foobar", "tacocat",
                "amanaplanacanalpanama", "amanaplanacanalpandemonium"
        )) {
            System.out.println(s + " is Palindrome : " + isPalindrome(s));
        }
    }

    public static boolean isPalindrome(String s)
    {
        // if length is 0 or 1 then String is palindrome
        if(s.isEmpty() || s.length() == 1) return true;
        if(s.charAt(0) == s.charAt(s.length()-1)) return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }

}
