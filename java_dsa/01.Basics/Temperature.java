import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float tempC = in.nextFloat();
        var tempF = (tempC * 9.0f/5.0f) + 32;
        System.out.println(tempF);
    }
}