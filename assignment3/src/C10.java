public class C10
{
    public static void main(String[] args)
    {
        int [] N = new int[] {100000, 200000, 500000, 1000000, 2000000};
        long duration = 0;

        for(int i=0; i < N.length; i++){
           int[] random_array = ArrayUtil.randomIntArray(N[i]);

           for(int j = 0; j < 5; j++){
               long start = System.nanoTime();
               LinearSearch(random_array, N[i],100);
               long end = System.nanoTime();
               duration += end - start;
           }
           duration = duration / 5;
           System.out.println("When N = " + N[i] + " Running Time = " + duration);
        }
    }

    public static int LinearSearch(int[] A, int n, int q){

        int index = 0;
        while(index < n && A[index] != q)
        {
            index = index+1;
        }

        if(index == n)
           return -1;
        else
           return index;
    }
}
