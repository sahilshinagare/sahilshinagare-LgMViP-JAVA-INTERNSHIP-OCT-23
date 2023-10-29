import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainSci {
    public static void main(String[] args) {

        ScientificCalculator scientificCalculator = new ScientificCalculator();

        scientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scientificCalculator.setSize(400, 650);
        scientificCalculator.setVisible(true);


    }
}
