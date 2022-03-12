package assignment;

import java.util.Scanner;

/**
 * HFC: is the largest number which divides each of the given numbers
 * without leaving any remainder.
 * 
 * LCM: is the smallest of two or mor of the common multiples of those numbers.
 * 
 */

public class CommonFactors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nTo get the Highest Common Factor please");
        System.out.print("Enter 1st number: ");
        int numOne = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int numTwo = input.nextInt();

        System.out.println("\nThe highest common factor of " + numOne + " and " + numTwo + " is "
                + highestCommonFactor(numOne, numTwo));

        input.close();
    }

    static int highestCommonFactor(int num1, int num2) {
        int remainder = 1;
        int largestNum = Math.max(num1, num2);
        int smallestNum = Math.min(num1, num2);

        while (remainder != 0) {
            if ((largestNum % smallestNum) != 0) {
                remainder = (largestNum % smallestNum);
                largestNum = smallestNum;
                smallestNum = remainder;
            } else {
                break;
            }
        }
        return remainder;
    }

}
