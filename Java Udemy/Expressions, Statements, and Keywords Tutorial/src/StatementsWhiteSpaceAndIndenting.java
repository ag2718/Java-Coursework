public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {

        int myVariable = 50;
        myVariable++;             //Single line statements
        myVariable--;
        System.out.println(myVariable);

        int anotherVariable = 50; anotherVariable--; System.out.println(anotherVariable);  //Many statements can be on one line

        System.out.println(" This is "
            + "another " +                 //One statement can take up multiple lines
                "still more.");


        /*

        In general, spaces should be put between almost everything on the same line,
        to make code look neater and easier to read.

        Intellige automatically indents all of the code blocks, but make sure all code is
        indented based on what methods or lines are inside each other. You can reformat code
        automatically by going to Code > Reformat Code.

        */








    }
}
