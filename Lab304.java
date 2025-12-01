import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat num = new DecimalFormat("00.00");

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.)"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.)"));

        double bmi = weight / Math.pow((height/100),2) ;
        String BMI_RESULT;


        if (bmi <18.5) {
            BMI_RESULT = "Bmi result is Underweight";
        } else if (bmi <18.5) {
            BMI_RESULT= "Bmi result is Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            BMI_RESULT = "Bmi result is Healthly Weight";

        } else if (bmi >= 25 && bmi <= 29.9 ) {
            BMI_RESULT = "Bmi result is Overweight";

        } else {
            BMI_RESULT="Obese"
        ;
        }
        JOptionPane.showMessageDialog(null,"Your BMI is " + num.format(bmi) +
                "\nBMI result is " + BMI_RESULT);







    }
}
