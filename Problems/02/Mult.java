//Take 2 numbers as input and print the largest number
package dinesh.com;

import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        long num1 = input.nextLong();
        System.out.print("Enter second number:");
        long num2 = input.nextLong();
        if (num1>num2){
            System.out.println("Largest number is "+num1);
        }
        else if (num2>num1) {
             System.out.println("Largest number is "+num2);
        }
    }
}
