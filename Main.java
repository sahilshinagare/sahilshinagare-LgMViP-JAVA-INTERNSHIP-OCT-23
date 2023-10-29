




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {

        try {

            CurrencyConverter1 currencyConverter = new CurrencyConverter1();

            currencyConverter.setTitle("Currency Converter App");
            
            currencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            currencyConverter.setSize(300, 300);
            currencyConverter.setCursor(null);
            currencyConverter.setLocationRelativeTo(null);
            currencyConverter.setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}



