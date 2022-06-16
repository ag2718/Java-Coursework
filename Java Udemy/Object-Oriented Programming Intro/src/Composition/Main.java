package Composition;

public class Main {

    public static void main(String[] args) {

        Table endTable = new Table("wood", new Dimensions(24, 24, 35));
        Table coffeeTable = new Table("glass", new Dimensions(55, 25, 35));
        Television TV = new Television("Panasonic", "Plasma", new Dimensions(30, 3, 35));
        Sofa sofa = new Sofa("leather", "sleek", "black", new Dimensions(75, 40, 30));

        LivingRoom livingRoom = new LivingRoom(endTable, coffeeTable, TV, sofa);

        livingRoom.clean();

        livingRoom.getSofa().clean();




    }
}
