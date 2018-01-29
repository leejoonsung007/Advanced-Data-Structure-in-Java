public class OuterClass
{
    private class InnerClass{
        void method()
        {
            System.out.println("我是被私有了的内部类");
        }
    }

    public void function()
    {
        new InnerClass().method();
    }
}
