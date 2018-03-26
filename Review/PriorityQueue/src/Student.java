public class Student {
    private int number;
    private String name;

    public Student(int number, String name){
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student [number=" + number + ", name=" + name +"]";
    }
}
