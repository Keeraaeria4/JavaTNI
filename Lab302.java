import javax.swing.*;
import java.util.Scanner;

public class Lab302 {
    public static void main(String[] args) {
        String name = (JOptionPane.showInputDialog("Enter your name"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.)"));

        int gender = JOptionPane.showConfirmDialog(null,
                "Are your biological gender is Male" ,
                "Gender",
                JOptionPane.YES_NO_OPTION);

        if (gender == JOptionPane.YES_OPTION) {  //gender == 0
            JOptionPane.showMessageDialog(null,
                    "Hello, Mr." + name + "\nif you height is " + height + "\nYour weight should be " + (height-100));

        }else {
            int female = JOptionPane.showConfirmDialog(null,
                    "Are your biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION);

            if (female == JOptionPane.YES_OPTION) {  //gender == 0
                JOptionPane.showMessageDialog(null,
                        "Hello, Ms." + name + "\nif you height is " + height + "\nYour weight should be " + (height - 110));
            } else {
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to meassure your weight and height");
            }
        }


    }
}
