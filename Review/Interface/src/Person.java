//抽象类
public abstract class Person implements StudyCode {

    //重写接口中的抽象类被实现
    @Override
    public void study()
    {
        System.out.println("good good study");
    }
    //定义一个抽象方法
    public abstract void eat();
}
