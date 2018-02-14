public class B6
{
    public static void main(String[] args)
    {
        MinValueIndex(new int[]{5,3,4,1,2},5);
    }

    public static void MinValueIndex(int[] A, int n)
    {
        int minValueIndex = 0;
        for(int k = 1; k <= n - 1; k++)
        {
            if (A[minValueIndex] > A[k])
                minValueIndex = k;
        }
        System.out.println(minValueIndex);
    }
}


