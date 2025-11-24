import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number = Integer.parseInt(scan.next());

        scan.nextLine();
        System.out.print("Enter number 2: ");
        double number2 = Integer.parseInt(scan.next());

        DecimalFormat frm = new
                DecimalFormat("0");

        System.out.println("\nSummation : " + frm.format(number + number2));
        System.out.println("Subtraction : " + frm.format(number - number2));
        System.out.println("Multiplication : " + frm.format(number * number2));
        System.out.println("Division : " + (number / number2));
        System.out.println("Modulus : " + frm.format(number % number2));
    }
}
