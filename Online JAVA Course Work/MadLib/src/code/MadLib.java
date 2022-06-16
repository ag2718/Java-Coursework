package code;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Name a noun?");
        String noun = input.next();

        System.out.println("Name an occupation?");
        String occupation1 = input.next();

        System.out.println("Name another occupation?");
        String occupation2 = input.next();

        System.out.println("Name an object?");
        String object = input.next();

        System.out.println("What is a word that describes how you are feeling today?");
        String feeling = input.next();

        System.out.println("Name a verb?");
        String verb = input.next();

        System.out.println("What ever happened to " + noun + "?");
        System.out.println("The " + occupation1 + ", the " + occupation2 + ", evening TV.");
        System.out.println("Everywhere you look (everywhere you go)");
        System.out.println("There's a heart (there's a heart)");
        System.out.println("A " + object + " to hold onto.");
        System.out.println("Everywhere you look (everywhere you go)");
        System.out.println("There's a face");
        System.out.println("Of somebody who needs you.");
        System.out.println("When you're lost out there and you're all " + feeling + " ,");
        System.out.println("A light is waiting to " + verb + " you home,");
        System.out.println("Everywhere you look.");




    }
}
