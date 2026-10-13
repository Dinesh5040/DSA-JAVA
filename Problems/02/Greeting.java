//Take a person’s name as input and print a greeting message using that name.
package dinesh.com;

import java.util.Scanner;

public class Greeting {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("hello "+name+" welcome!");
    }
}
