package Problems.arrays.minAndMax;

import java.lang.*;
import java.io.*;
import java.util.Arrays;

class Pair
{
    long first, second;
    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

//13s
//Driver Code
public class MinAndMax {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Pair product = Compute.getMinMax(a, n);
            System.out.println(product.first+" "+product.second);

        }
    }
}

class Compute
{
    static Pair getMinMax(long[] a, long n)
    {
        /*
             Slower Approach with time complexity O(N) :

                long min=a[0];
                long max=a[0];

                for( long l : a) {
                    if(l<=min) min=l;
                    else if(l>=max) max=l;
                }
        */

//      Faster Approach with time complexity O(n log n) :
        Arrays.sort(a);
        return new Pair(a[0], a[(int) n-1]);

    }
}

