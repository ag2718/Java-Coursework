package Composition;

public class Table {

    private String material;
    private Dimensions dimensions;

    public Table(String material, Dimensions dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }

    protected void dust () {
        System.out.println("Table has been dusted");
    }

}
