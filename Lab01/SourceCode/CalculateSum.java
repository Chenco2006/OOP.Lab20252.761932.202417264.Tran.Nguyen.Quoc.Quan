package calculatesum;

import javax.swing.JOptionPane;

public class CalculateSum {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strResult = "";

        strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number: ", "Input first number", 
            JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number: ", "Input second number", 
            JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        strResult += "Sum: " + sum + "\n";
        strResult += "Difference: " + difference + "\n";
        strResult += "Product: " + product + "\n";

        if (num2 != 0) {
            double quotient = num1 / num2;
            strResult += "Quotient: " + quotient;
        } else {
            strResult += "Quotient: Cannot divide by zero!";
        }

        JOptionPane.showMessageDialog(null, strResult, 
            "Calculation Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}