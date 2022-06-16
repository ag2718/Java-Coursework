public class Strings {
    public static void main(String[] args) {

        String myString = "This is my string";
        System.out.println(myString);
        myString = myString + " and I have added more.";
        System.out.println(myString);

        String numString = "250.55";
        numString = numString + 49.95; //Not possible to add up numbers in strings, instead converts numbers to strings
        System.out.println(numString);

    }
}
