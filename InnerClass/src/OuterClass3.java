public class OuterClass3 {
    private  static String outerName;
    public int age;

    static class InnerClass2{
        //在静态内部类中可以存在静态成员
        public static String _innerName = "static variable";
        public void display(){
            //静态内部类只能访问外部类的静态成员变量和方法
            //不能访问外部类的非晶态成员变量和方法
            System.out.println("OuterClass name: " + outerName);
        }
    }

    class InnerClass3{
        //非静态内部类中不能存在静态成员
        public String _innerName = "no static variable";
        //非静态内部类中可以调用外部类的任何成员，不管是静态的还是非静态的
        public void display(){
            System.out.println("OuterClass name: " + outerName);
            System.out.println("OuterClass age: " + age);
        }
    }

    public void display(){
        //外部类能直接访问静态内部类静态元素
        System.out.println(InnerClass2._innerName);
        //静态内部类可以直接创建实例不需要依赖于外部类
        new InnerClass2().display();

        //非静态内部类的创建需要依赖于外部类
        OuterClass3.InnerClass3 innerClass3 = new OuterClass3().new InnerClass3();
        innerClass3.display();
    }

    public static void main(String[] args){
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.display();
    }


}
