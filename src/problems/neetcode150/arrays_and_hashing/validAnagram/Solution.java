package problems.neetcode150.arrays_and_hashing.validAnagram;

public class Solution {

    public static boolean isAnagram(String s, String t) {
        int sLength = s.length();
        if(sLength != t.length()) return false;

        int[] charCounts = new int[26];
        for(int i=0; i<sLength; i++) {
            charCounts[s.charAt(i)-'a']++;
            charCounts[t.charAt(i)-'a']--;
        }

        for(int count:charCounts) {
            if(count != 0) return false;
        }
        return true;
    }

}