public class FloatsAndDoubles {
    public static void main(String[] args) {

        float myFloatValue = 5f / 3f; //8 decimal points, width of 32
        double myDoubleValue = 5d / 3d; //16 decimal points, width of 64

        double pi = 3.141_592_7d;

        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " lbs = " + kilograms + " kg");

    }
}
