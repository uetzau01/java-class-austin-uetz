package exercise7;

/**
 *
 * @author uetzau01
 */
public class SalariedEmployee extends Employee {
    private double salary;
    
    public SalariedEmployee(double salary, String name, String ssn) {
        super(name, ssn);
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public double getNetPay() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void printWeeklyCheck() {
        double weeklyCheck;
        weeklyCheck = salary / 52;
        System.out.println("Weekly Check: " + weeklyCheck);
    }
}
