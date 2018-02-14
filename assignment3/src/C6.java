import java.util.Random;

public class C6 {
    public static void main(String[] args)
    {
        Random generator = new Random();
        int [] N = new int[] {100000, 200000, 500000, 1000000, 2000000};
        double duration = 0;

        for(int i=0; i < N.length; i++){
            int[] random_array = ArrayUtil.randomIntArray(N[i]);
            long start = System.currentTimeMillis();
            MinValueIndex(random_array, N[i]);
            long end = System.currentTimeMillis();
            duration += end - start;
            duration = duration / 5;
            System.out.println("When N = " + N[i] + " Running Time = " + duration);
    }
}

    public static int MinValueIndex(int[] A, int n)
    {
        int minValueIndex = 0;
        for(int k = 1; k <= n - 1; k++)
        {
            if (A[minValueIndex] > A[k])
                minValueIndex = k;
        }
        return minValueIndex;
    }
}
