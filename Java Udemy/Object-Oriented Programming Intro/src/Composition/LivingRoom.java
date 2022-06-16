package Composition;

public class LivingRoom {

    private Table endTable;
    private Table coffeeTable;
    private Television television;
    private Sofa sofa;

    public LivingRoom(Table endTable, Table coffeeTable, Television television, Sofa sofa) {
        this.endTable = endTable;
        this.coffeeTable = coffeeTable;
        this.television = television;
        this.sofa = sofa;
    }

    public Table getEndTable() {
        return endTable;
    }

    public Table getCoffeeTable() {
        return coffeeTable;
    }

    public Television getTelevision() {
        return television;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void clean() {
        endTable.dust();
        coffeeTable.dust();
        sofa.clean();
    }


}
