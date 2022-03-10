package assignment;

import java.util.Scanner;

public class MultiplicationTableNumber {

    public static void main(String[] args) {
        /**
         * Take a number as input and print the multiplication table for it.
         */

        Scanner input = new Scanner(System.in);

        // Giving the user message guide
        System.out.println("\nTo get the multiplication table please");

        // Taking an input from the user
        System.out.print("Enter a number: ");

        // Storing the input value into a variable
        int num = input.nextInt();

        System.out.println(); // new line

        // looping through and displaying each time the product
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }

        // closing the input stream
        input.close();

    }

}
