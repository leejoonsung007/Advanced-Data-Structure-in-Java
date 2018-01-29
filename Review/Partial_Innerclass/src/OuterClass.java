public class OuterClass
{
    public void method()
    {
        final String name = "我是一个局部的成员变量";
        //此时name就变成常量了！

        class InnerClass{
            void innerfunction()
            {
                System.out.println(name);
            }
        }

    }
}
