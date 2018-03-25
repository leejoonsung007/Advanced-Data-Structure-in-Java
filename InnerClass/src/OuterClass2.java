public class OuterClass2 {
    public void display(){
        //外部类访问内部类元素，需要通过内部类引用访问
        InnerClass2 innerClass2 = new InnerClass2();
        innerClass2.innerDisplay();
    }

    public class InnerClass2{
        public void innerDisplay(){
            System.out.println("I am inner class");
        }
    }

    public static void main(String[] args){
        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.display();
    }
}
