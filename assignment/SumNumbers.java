package assignment;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        /**
         * create a program that takes 2 number
         * and print out their sum
         */
        
        Scanner input = new Scanner(System.in);

        // Showing a message guide...
        System.out.println("To out the sum of numbers please");
        System.out.print("Enter two numbers: ");

        int num1 = input.nextInt(); // Taking the 1st number
        int num2 = input.nextInt(); // Taking the 2nd number

        // Displaying & calculating the sum of the 2 numbers
        System.out.println("The result is: "+ (num1 + num2));

        // Closing the input stream
        input.close();




    }
    
}
