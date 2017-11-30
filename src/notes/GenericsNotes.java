/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        System.out.println(helper.getString(i));
        Double d = new Double(2.52);
        System.out.println(helper.getString(d));
        Student2 s = new Student2();
        System.out.println(helper.getString(s));
    }
    
}

class Helper {
    public <T> String getString(T item) {
        return "String is " + item.toString();
    }
}

class Student2 {
    private String name = "Alice";
    
    public String toString() {
        return "Student: " + name;
    }
}
