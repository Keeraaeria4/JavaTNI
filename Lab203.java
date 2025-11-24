import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter product id : ");
        String product_name = scan.nextLine();

        System.out.print("Enter product name : ");
        String product_id = scan.nextLine();

        System.out.print("Enter product item : ");
        String product_item = scan.nextLine();

        System.out.print("Enter price per piece : ");
        String product_price_per_piece = scan.nextLine();

        // แปลง String → ตัวเลข
        int item = Integer.parseInt(product_item);
        double price = Double.parseDouble(product_price_per_piece);

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.println("\nProduct name : " + product_name + " ( " + product_id + " )");
        System.out.println("Product item : " + item + " pieces");
        System.out.println("Product price per piece : " + frm.format(price) + " baht/piece");
        System.out.println("Total price : " + frm.format(item * price) + " baht");
    }
}
