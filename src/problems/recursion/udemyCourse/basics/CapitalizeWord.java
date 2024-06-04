package problems.recursion.udemyCourse.basics;

public class CapitalizeWord {

    //Problem : Implement a function that capitalizes each word in String.

    public static void main(String[] args) {
        String s1 = "i love java";
        String capitalized = capitalizeWord(s1); // 'avaj'
        System.out.format("The capitalized String is '%s' %n", capitalized);
    }

    public static String capitalizeWord(String str){
        if(str.isEmpty()) return str;
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) return Character.toString(Character.toUpperCase(chr));
        if((str.substring(str.length()-2, str.length()-1).equals(" "))) chr = Character.toUpperCase(chr);
        return capitalizeWord(str.substring(0,str.length()-1))+ chr;
    }

}
