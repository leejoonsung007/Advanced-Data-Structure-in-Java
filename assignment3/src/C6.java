import java.util.Random;

public class C6 {
    public static void main(String[] args)
    {
        Random generator = new Random();
        int [] N = new int[] {100000, 200000, 500000, 1000000, 2000000};
        long duration = 0;

        for(int i=0; i < N.length; i++) {
            int[] random_array = ArrayUtil.randomIntArray(N[i]);

            for (int j = 0; j < 5; j++) {
                long start = System.nanoTime();
                MinValueIndex(random_array, N[i]);
                long end = System.nanoTime();
                duration += end - start;
            }
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
