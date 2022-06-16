package Composition;

public class Sofa {

    private String material;
    private String style;
    private String color;
    private Dimensions dimensions;

    public Sofa(String material, String style, String color, Dimensions dimensions) {
        this.material = material;
        this.style = style;
        this.color = color;
        this.dimensions = dimensions;
    }


    protected void clean() {
        switch(material) {
            case "leather":
                System.out.println("Leather cleaner applied to sofa");
            case "microfiber":
                System.out.println("Vaccuum and suck up dirt inside the cushions");
        }
    }
}
