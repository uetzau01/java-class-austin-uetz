package exercise7;

/**
 *
 * @author uetzau01
 */
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;
    
    public HourlyEmployee(double wageRate, double hours, String name, String ssn) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }
    
    
}
