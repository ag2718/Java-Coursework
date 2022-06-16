public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + "\nSalary: " + salary;
    }

    public static void main(String[] args) {
        System.out.println(new Employee("Bob", 90000) + "\n");
        System.out.println(new Manager("Alice", 150000, "HR") + "\n");
        System.out.println(new Executive("Tom", 500000, "Advertising") + "\n");
    }

}

class Manager extends Employee {

    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }
}

class Executive extends Manager {

    public Executive(String name, int salary, String department) {
        super(name, salary, department);
    }

    public String toString() {
        return "EXECUTIVE:\n" + super.toString();
    }
}
