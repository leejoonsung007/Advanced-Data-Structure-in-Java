public class OuterClass1 {
    public void display(){
        System.out.println("this is OuterClass1");
    }
    //在创建外部类时，内部类会自动捕获一个外部类的引用，
    // 所以内部类访问外部类元素，实际上是通过他所持有外部类引用访问的。
    public class InnerClass1{
        //获取外部类的引用
        public OuterClass1 getOuterClass(){
            return OuterClass1.this;
        }

        public void innerDisplay(){
            //内部类也可以通过外部类的引用访问外部元素
            getOuterClass().display();
        }
    }

    public static void main(String[] args){
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass1 innerClass1 = outerClass1.new InnerClass1();
        innerClass1.innerDisplay();
    }
}
