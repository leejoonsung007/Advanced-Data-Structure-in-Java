public class Outerclass {

    private String outerName;
    private int outerAge;

    public class InnerClass{
        private int innerName;
        InnerClass(){
            //内部类可以访问外部类的元素
            outerName = "I am outer class";
            outerAge = 23;
        }

        public void display(){
            System.out.println(outerName + " and my age is " + outerAge);
        }
    }

    public static void main(String[] args){
        Outerclass outclass = new Outerclass();
        Outerclass.InnerClass innerClass = outclass.new InnerClass();
        innerClass.display();
    }
}
