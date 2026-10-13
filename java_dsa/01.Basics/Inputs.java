
import java.util.Scanner;

public class Inputs {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rollno: ");
        int rollno = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your rollno is:" + rollno);
        System.out.println("Your year is:" + year);
        System.out.println("Your age is:" + age);

    }
}
