package exercise6;

import java.util.Objects;

/**
 * Class Crow
 * @author Austin Uetz
 */
public class Crow {
    private String name;
    private int age;
    private int iq = 100;

    public Crow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.age;
        hash = 41 * hash + this.iq;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crow other = (Crow) obj;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s is %d years old with an iq of %d", name, age, iq);
        //return "Crow{" + "name=" + name + ", age=" + age + ", iq=" + iq + '}';
    }
    
}
