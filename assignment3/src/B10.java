public class B10
{
    public static void main(String[] args)
    {
        LinearSearch(new int[]{1,2,3,4,5},5,4);
    }

    public static void LinearSearch(int[] A, int n, int q){

        int index = 0;
        while(index < n && A[index] != q)
        {
            index = index+1;
        }

        if(index == n)
            System.out.print(-1);
        else
            System.out.print(index);
    }
}
