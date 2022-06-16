public class Animal {
    private String name;
    private String type;
    private double age;
    private int cost;

    /** Constructs an Animal object with name n, type t, age a, and cost c */
    public Animal(String n, String t, double a, int c) {
        name = n;
        type = t;
        age = a;
        cost = c;
    }

    /** Returns the type of the animal (for example, "dog" or "cat") */
    public String getType() {
        return type;
    }

    /** Returns the age of the animal when it arrived at the shelter, in years */
    public double getAge() {
        return age;
    }

    /** Returns the cost, in dollars, of adopting the animal */
    public int getCost() {
        return cost;
    }

    public String toString() {
        return "(" + name + ", " + type + ", " + age + ", " + cost + ")";
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
}
