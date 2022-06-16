package MasterChallenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String breadRollType, String meat, double basePrice) {
        super(breadRollType, meat, basePrice, 2);
        this.newAddition("Chips", 1.0);
        this.newAddition("Drink", 1.00);
    }
}
