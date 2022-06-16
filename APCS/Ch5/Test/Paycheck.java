import java.util.Scanner;

/**
 * Class to compute the pay of an employee
 */
public class Paycheck {

    private String name;
    private double hourlyWage;
    private double hoursWorked;

    /**
     * Constructor for class (instance variables are initialized based on user
     * input)
     */
    public Paycheck() {

        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        this.name = in.next();

        System.out.print("What is your hourly wage? ");
        this.hourlyWage = in.nextDouble();

        System.out.print("How many hours did you work this week? ");
        this.hoursWorked = in.nextDouble();

        in.close();
    }

    /**
     * Method to get the name of the employee
     * 
     * @return name of the employee
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method to get the hourly wage of the employee
     * 
     * @return hourly wage of the employee
     */
    public double getWage() {
        return this.hourlyWage;
    }

    /**
     * Method to get the number of hours the employee worked
     * 
     * @return number of hours the employee worked
     */
    public double getNumHours() {
        return this.hoursWorked;
    }

    /**
     * Method to compute the pay of an employee based on hours worked and hourly
     * wage (including overtime)
     * 
     * @return total pay of the employee
     */
    public double computePay() {
        double pay = this.hoursWorked * this.hourlyWage;
        if (this.hoursWorked > 40) {
            pay += 0.5 * (this.hoursWorked - 40) * this.hourlyWage;
        }
        return pay;
    }

}
