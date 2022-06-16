import java.util.ArrayList;

public class Ch7Lab {
    public static void main(String[] args) {

        // PROBLEM 1
        System.out.println("\nPROBLEM #1:");

        ArrayList<String> names = new ArrayList<String>();

        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");

        System.out.println("Names list: " + names);

        System.out.println("First name: " + names.get(0));
        System.out.println("Last name: " + names.get(names.size() - 1));

        System.out.println("Last name: " + names.get(names.size() - 1));
        System.out.println("Size of list: " + names.size());

        names.set(0, "Alice B. Toklas");
        System.out.println("Updated names list: " + names);

        names.add(4, "Doug");
        System.out.println("Updated names list: " + names);

        for (String name : names) {
            System.out.print(name + ", ");
        }

        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println("\nSecond list: " + names2);

        names.remove(0);

        System.out.println("First list: " + names);
        System.out.println("Second list: " + names2);

        // PROBLEM 2
        System.out.println("\nPROBLEM #2:");

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Bob");
        strings.add("Alice");
        strings.add("Charlie");
        strings.add("Harry");
        strings.add("Tom");

        System.out.println("Original list: " + strings);

        strings.remove(strings.size() - 1);
        strings.set(1, "Doug");

        System.out.println("Updated list: " + strings);

        // PROBLEM 3
        System.out.println("\nPROBLEM #3:");

        ArrayList<String> names3 = new ArrayList<String>();
        String[] friends = { "Sam", "Jessica", "Mark", "Alexis" };
        for (int i = 0; i < friends.length; i++) {
            names3.add(friends[i]);
        }
        System.out.println(names3);

        // PROBLEM 4
        System.out.println("\nPROBLEM #4:");

        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = { 1, 5, 7, 9, -2, 3, 2 };
        for (int i = 0; i < nums.length; i++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 1, 7, -2, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenIndex(values);

        // PROBLEM 5
        System.out.println("\n\nPROBLEM #5:");

        ArrayList<Integer> values2 = new ArrayList<Integer>();
        int[] nums2 = { 1, 44, 7, 9, -16, 3 };
        for (int num : nums2) {
            values2.add(num);
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");

        System.out.println("Your Result:\t\t " + values2);

        // PROBLEM 6
        System.out.println("\nPROBLEM #6:");

        // instantiate ArrayList and fill with Integers
        ArrayList<Integer> values3 = new ArrayList<Integer>();
        int[] nums3 = { -2, 34, -11, 9, -6, 3 };
        for (int i = 0; i < nums3.length; i++) {
            values3.add(nums3[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values3));

        // PROBLEM 7
        System.out.println("\n\nPROBLEM #7:");

        // instantiate ArrayList and fill with Integers
        ArrayList<String> values4 = new ArrayList<String>();
        String[] words = { "bathtub", "fish", "computer", "cat", "foo" };
        for (int i = 0; i < words.length; i++) {
            values4.add(words[i]);
        }
        removeLongStrings(values4);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values4);

        // PROBLEM 8
        System.out.println("\nPROBLEM #8:");
        // instantiate ArrayList and fill with Integers
        ArrayList<String> values5 = new ArrayList<String>();
        String[] words2 = { "singapore", "cattle", "metropolitan", "turnstile" };
        for (int i = 0; i < words2.length; i++) {
            values5.add(words2[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values5));

    }

    public static void printEvenIndex(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(list.get(i) + ", ");

            }
        }
    }

    public static int sumNegValues(ArrayList<Integer> list) {
        int sum = 0;
        for (int element : list) {
            if (element < 0)
                sum += element;
        }
        return sum;
    }

    public static void removeLongStrings(ArrayList<String> list) {
        int index = 0;
        while (index < list.size()) {
            if (list.get(index).length() > 4)
                list.remove(index);
            else
                index++;
        }
    }

    public static String findLongest(ArrayList<String> list) {
        String longest = "";
        for (String str : list) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}
