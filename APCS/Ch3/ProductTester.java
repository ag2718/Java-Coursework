public class ProductTester {
    public static void main(String[] args) {
        Product toaster = new Product("Toaster", 29.95);
        Product bed = new Product("Bed", 499.95);

        System.out.println("Toaster Information:");
        System.out.println(toaster.getName());
        System.out.println(toaster.getPrice());

        System.out.println("Bed Information:");
        System.out.println(bed.getName());
        System.out.println(bed.getPrice());

        bed.reducePrice(5);
        toaster.reducePrice(5);

        System.out.println("Toaster Information:");
        System.out.println(toaster.getName());
        System.out.println(toaster.getPrice());

        System.out.println("Bed Information:");
        System.out.println(bed.getName());
        System.out.println(bed.getPrice());

        bed.reducePrice(5);
        toaster.reducePrice(5);

    }
}
