//Input currency in rupees and output in USD
package dinesh.com;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter USD :");
        double USD = input.nextDouble();
        double rupees = (USD*95.77);
        System.out.println("Rupees :" +rupees);
    }
}
