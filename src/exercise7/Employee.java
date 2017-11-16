package exercise7;

/**
 *
 * @author uetzau01
 */
public class Employee {
    protected String name;
    protected String ssn = "000-00-0000";
    protected double netPay;
    
    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    protected double getNetPay() {
        return netPay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    } 
    
    public void printWeeklyCheck() {
        double weeklyCheck;
        weeklyCheck = netPay / 52;
        System.out.println("Weekly Check: " + weeklyCheck);
}
    
    
}
