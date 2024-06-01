package problems.recursion.udemyCourse.basics;

public class ReverseAString {

    //Problem : Write a recursive function called reverse which accepts a string and returns a new string in reverse.

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "appmillers";
        String r1 = reverse(s1); // 'avaj'
        String r2 = reverse(s2); // 'srellimppa'
        System.out.format("The reverse of %s is %s %n", s1, r1);
        System.out.format("The reverse of %s is %s %n", s2, r2);
    }

    public static String reverse(String str) {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
