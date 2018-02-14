public class B4
{
    public static void main(String[] args)
    {
        Difference(1,2);
    }

    public static void Difference(int a, int b)
    {
        System.out.println("output ");
        if(a > b)
            System.out.print(a - b);
        else
            System.out.print(b - a);
    }
}
