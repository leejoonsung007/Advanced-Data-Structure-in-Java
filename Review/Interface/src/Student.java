public class Student extends Person implements StudyCode{
    @Override
    public void eat() {
        System.out.println("吃香喝辣");
    }
    //这里没有实现接口中的方法
    //当子类要实现接口中的方法只需要重写匪类中
    @Override
    public void study(){
        System.out.println("study what?");
    }

}

