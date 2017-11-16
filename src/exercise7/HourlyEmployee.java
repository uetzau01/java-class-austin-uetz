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
        this.netPay = hours * wageRate;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }
    
    @Override
    public double getNetPay() {
        return hours * wageRate;
    }
    
    public void setWageRate(double newWage) {
        this.wageRate = newWage;
    }
    
    public void setHours(double hours) {
        this.hours = hours;
    }
    
    @Override
    public void printWeeklyCheck() {
        double weeklyCheck;
        weeklyCheck = hours * wageRate / 52;
        System.out.println("Weekly Check: " + weeklyCheck);
    }
}
