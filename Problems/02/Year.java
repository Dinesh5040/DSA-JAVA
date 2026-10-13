//To Calculate Number of months and days;
package dinesh.com;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year :");
        int year = input.nextInt();
        int months=year*12;
        System.out.println("Number of months :" +months);
        int days = year*365;
        System.out.print("Number of days :" +days);



    }
}
