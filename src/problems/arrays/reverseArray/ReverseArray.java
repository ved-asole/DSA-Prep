package problems.arrays.reverseArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {

    public static String reverseWord(String str)
    {
        char [] charArray = str.toCharArray();
        int length = charArray.length;
        char temp;

        for(int i=0; i<length/2; i++){

            temp = charArray[i];
            charArray[i] = charArray[length-i-1];
            charArray[length-i-1] = temp;

        }

        return new String(charArray);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(reverseWord(str));
        }
    }

}
