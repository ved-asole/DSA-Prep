package problems.array.minAndMax;

public class Pair
{
    long min, max;

    public Pair() {
    }

    public Pair(long min, long max)
    {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "min=" + min + ", max=" + max ;
    }
}