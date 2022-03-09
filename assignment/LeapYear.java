package assignment;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        /**
         * Create a program which take a year and
         * checks or finds if it's a leap year or not
         */

        Scanner input = new Scanner(System.in);

        System.out.println("To find if it\'s a leap year or not please");
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            }
            if (year % 100 == 0) {
                System.out.println(year + " is not a leap year");
            } else {
                System.out.println(year + " is a leap year");

            }
        }
        input.close();

    }

}
