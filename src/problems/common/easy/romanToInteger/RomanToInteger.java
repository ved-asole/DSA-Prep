package problems.common.easy.romanToInteger;

public class RomanToInteger {

    public static int romanToInt(String s) {
        int sum=0;
        int num=0;
        int next=0;
        int strLength=s.length();

        for(int i=0; i<strLength;i++){

            switch(s.charAt(i)){
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if(i<strLength-1){
                switch(s.charAt(i+1)){
                    case 'I' -> next = 1;
                    case 'V' -> next = 5;
                    case 'X' -> next = 10;
                    case 'L' -> next = 50;
                    case 'C' -> next = 100;
                    case 'D' -> next = 500;
                    case 'M' -> next = 1000;
                }
            }

            if(num < next) sum-=num;
            else sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String romanNum = "XII";
        int intNum = romanToInt(romanNum);
        System.out.println("The value of roman number "+ romanNum + " in integer is : " + intNum);
    }

}