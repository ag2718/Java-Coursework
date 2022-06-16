package MasterChallenge;

public class Hamburger {

    private int maxAdditions = 4;

    private String breadRollType;
    private String meat;
    private double basePrice;
    private double price;
    private String receipt;

    public Hamburger () {
        this("Whole wheat", "beef", 3.50);
    }


    public Hamburger(String breadRollType, String meat, double basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = basePrice;
        this.basePrice = basePrice;
        this.receipt = "$" + this.basePrice + "   Base hamburger";
    }

    protected Hamburger(String breadRollType, String meat, double basePrice, int maxAdditions) {
        this(breadRollType, meat, basePrice);
        this.maxAdditions = maxAdditions;
    }



    private int additions = 0;


    public void newAddition(String name, double additionalPrice) {
        if (additions < this.maxAdditions) {
            this.price += additionalPrice;
            receipt += "\n$" + additionalPrice + "   " + name;
            additions++;
        } else {
            System.out.println("Addition limit reached.");
        }
    }

    public void displayPrice() {
        System.out.println(receipt);
        System.out.println("--------------");
        System.out.println("Total price was $" + price);
        System.out.println("");
        System.out.println("");
    }

}
