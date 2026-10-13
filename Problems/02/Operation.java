//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package dinesh.com;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number :");
         double num1 = input.nextDouble();
        System.out.print("Enter second number :");
        double num2 = input.nextDouble();
        System.out.print("operator : ");
        char operator = input.next().charAt(0);
        double Result;
        if (operator=='+'){
            Result = num1+num2;
            System.out.println("Your Sum is : "+ Result);
        }
        else if (operator=='-'){
        Result = num1-num2;
        System.out.println("Your sub is : "+ Result);
        }
        else if (operator=='*'){
            Result = num1*num2;
            System.out.println("Your multiplication is : "+ Result);
        }
        else if (operator=='/'){
            Result = num1/num2;
            System.out.println("Your divide is : "+ Result);
        }
        input.close();
    }
}
