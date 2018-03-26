import java.util.Comparator;

public class ComparetoByNumber implements Comparator {

    public int compare(Object o1, Object o2){
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        //compare by number
        int result = s1.getNumber() > s2.getNumber() ? 1 :(s1.getNumber()==s2.getNumber()) ? 0 : -1;

        //if number is equal, then compare by name
        if(result==0){
            int compareByName = s1.getName().compareTo(s2.getName());
            if(compareByName>0)
                result = 1;
            else if(compareByName==0)
                result = 0;
            else
                result=-1;
        }
        return -result;
    }

}
