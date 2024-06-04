package problems.recursion.udemyCourse.basics;

public class FindUppercase {

    //Problem : Given a string find its first uppercase letter

    public static void main(String[] args) {
        String s1 = "randomString";
        char firstUppercase = first(s1); // 'avaj'
        System.out.format("The first Uppercase letter in String %s is '%s' %n", s1, firstUppercase);
    }

    static char first(String str) {
        if(str.isEmpty()) return ' ';
        if (Character.isUpperCase(str.charAt(0))) return str.charAt(0);
        else return first(str.substring(1));
    }

}
