package problems.array.udemyCourse.minAndMax;

public class Compute
{
    public static Pair getMinMax(long[] a, long n)
    {
        /*
              Slower Approach with time complexity O(n log n) :
              Arrays.sort(a);
              return new Pair(a[0], a[(int) n-1]);
        */

        /*
             Slower Approach with time complexity O(N) :

                long min=a[0];
                long max=a[0];

                for( long l : a) {
                    if(l<=min) min=l;
                    else if(l>=max) max=l;
                }
        */

        // Faster Approach with time complexity O(N) but with less number of comparisons and space complexity O(log n) :
        return getMinMax(a, 0, (int) (n-1));
    }

    static Pair getMinMax(long arr[], int low, int high)
    {
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;

        // If there is only one element
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }

        /* If there are two elements */
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            }
            else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }

        /* If there are more than 2 elements */
        mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid + 1, high);

        /* compare minimums of two parts*/
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        }
        else {
            minmax.min = mmr.min;
        }

        /* compare maximums of two parts*/
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        }
        else {
            minmax.max = mmr.max;
        }

        return minmax;
    }

}