package Inheritance;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("Unknown", "Unknown", 5000);
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, "Unknown", creditLimit);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }



}
