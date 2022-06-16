package MasterChallenge;

public class Main {

    public static void main(String[] args) {
        Hamburger newHamburger = new Hamburger("rye", "beef", 5.5);
        newHamburger.newAddition("Lettuce", 1.00);
        newHamburger.newAddition("Ketchup", 0.50);
        newHamburger.newAddition("Tomatoes", 0.75);
        newHamburger.displayPrice();

        HealthyBurger healthy = new HealthyBurger("Chicken", 4);
        healthy.newAddition("Cheese", 0.50);
        healthy.displayPrice();

        DeluxeBurger expensive = new DeluxeBurger("Whole wheat", "Beef",6.5);
        expensive.displayPrice();

    }


}
