public class Person {

    private String name;
    private int yearOfBirth;

    public Person(String name, int year) {
        this.name = name;
        this.yearOfBirth = year;
    }

    public String toString() {
        return "Name: " + name + "\nYear of Birth: " + yearOfBirth;
    }

    public static void main(String[] args) {

        System.out.println(new Person("Bob", 1998) + "\n");
        System.out.println(new Student("Alice", 2001, "Computer Science") + "\n");
        System.out.println(new Instructor("Mr. Jones", 1979, 80000) + "\n");

    }

}

class Student extends Person {

    private String major;

    public Student(String name, int year, String major) {
        super(name, year);
        this.major = major;
    }

    public String toString() {
        return super.toString() + "\nMajor: " + major;
    }

}

class Instructor extends Person {

    private int salary;

    public Instructor(String name, int year, int salary) {
        super(name, year);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }

}
