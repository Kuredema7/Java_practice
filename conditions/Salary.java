package conditions;

import java.util.Scanner;

public class Salary{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();

        if (salary > 10000){
            salary += 2000;
        } else {
            salary += 1000;
        }

        System.out.println("Your salary is: " + salary);

    }

}