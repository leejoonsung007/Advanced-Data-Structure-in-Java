public class Outerclass
{
    private static String name = "外部类的成员变量";

    static class InnerClass
    {
        void method()
        {
            System.out.println(name);
        }
    }
}
