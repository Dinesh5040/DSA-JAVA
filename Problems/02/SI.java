//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package dinesh.com;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal :");
        double P = input.nextDouble();
        System.out.print("Enter Time :");
        double T = input.nextDouble();
        System.out.print("Enter Rate :");
        double R = input.nextDouble();
        double SI = (P*T*R)/100;
        System.out.println("Simple Interest :" +SI);

    }

}
