import javax.swing.*;

public class Lab208 {
    public static void main(String[] args) {
        int start_hour = Integer.parseInt(
                JOptionPane.showInputDialog("Input start time (hour):"));
        int start_minute = Integer.parseInt(
                JOptionPane.showInputDialog("Input start time (minute):"));

        int end_hour = Integer.parseInt(
                JOptionPane.showInputDialog("Input end time (hour):"));
        int end_minute = Integer.parseInt(
                JOptionPane.showInputDialog("Input end time (minute):"));

        int startTotal = start_hour * 60 + start_minute;
        int endTotal = end_hour * 60 + end_minute;

        int parkingMin = (endTotal - startTotal + 1440) % 1440;

        int hour = parkingMin / 60;
        int minute = parkingMin % 60;

        double cost = parkingMin * 0.25;

        JOptionPane.showMessageDialog(
                null,
                "Start parking at: " + start_hour + ":" + start_minute +
                        "\nEnd parking at: " + end_hour + ":" + end_minute +
                        "\nTotal time = " + hour + " hour " + minute + " minutes" +
                        "\nParking payment = " + cost + " baht.");
    }
}
