import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner srn = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int number = srn.nextInt();

        if (number == 0){
            System.out.print("This is Zero number");
        }else{
            if(number%2 == 0){
                System.out.print("This number is Even");
            } else if (number%2 != 0) {
                System.out.print("This number is Odd");
            }

            if (number > 0 ){
                System.out.print(" and Positive number");
            }else if(number < 0){
                System.out.print(" and Negative number");
            }
        }


    }
}
