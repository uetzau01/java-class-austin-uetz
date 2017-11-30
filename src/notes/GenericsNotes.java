package notes;

/**
 *
 * @author uetzau01
 */
public class GenericsNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Helper helper = new Helper();
        Integer i = new Integer(252);
        Double d = new Double (2.52);
        System.out.println(helper.getString(i));
        System.out.println(helper.getString(d));
        Student2 s1 = new Student2("Bob");
        System.out.println(helper.getString(s1));
        Student2 s2 = new Student2("Alice");
        System.out.println(helper.getString(s2));
        
        System.out.println(helper.greater(s1,s2));
        
        Student2[] roster = {s1, s2};
        helper.printAllItems(roster);
        String[] roster2 = {"hi", "hello", "howdy", "hey"};
        helper.printAllItems(roster2);
    }
    
}

class Helper {
    public <T> String getString(T item) {
        return "String is " + item.toString();
    }
    
    public <T extends Comparable> String greater(T item1, T item2) {
        if (item1.compareTo(item2) >= 0) {
            return item1.toString();
        } else {
            return item2.toString();
        }
    }
    
    public <T> void printAllItems(T ... list) {
        for (T item: list) {
            System.out.println(item);
        }
    }
}

class Student2 implements Comparable {
    private String name = "Alice";
    
    public Student2(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "Student: " + name;
    }
    
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student2) {
            Student2 anotherStudent = (Student2)o;
            return this.name.compareTo(anotherStudent.name);
        } else {
            return -1;
        }
    }
}