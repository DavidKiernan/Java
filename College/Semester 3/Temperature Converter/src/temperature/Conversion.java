package temperature;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by David on 19/11/2014.
 */
public class Conversion extends JFrame {
    private JTextField celInput;
    private JButton calcButton;
    private JLabel result,celMsg;

    private final int WIDTH=300, HEIGHT=100;

    public Conversion(){
        setTitle("Celsius to Fahrenheit");  //Set the Title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what happens when close button is clicked
        setLayout(new FlowLayout());
        celMsg = new JLabel("Enter Celsius Temperature:");
        add(celMsg);
        celInput = new JTextField(10);
        add(celInput);
        calcButton= new JButton("Calculate Fahrenheit");
        add(calcButton);
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fTemp, cTemp; // Fahrenheit, Celsius

                String text = celInput.getText();
                cTemp = Integer.parseInt(text);
                fTemp = (cTemp * 9/5)+32;
                result.setText("Fah: "+Integer.toString(fTemp));
            }
        });
        result = new JLabel("");
        add(result);
        setSize(WIDTH,HEIGHT);

    }
    public static void main(String[]args){
        Conversion c = new Conversion();
        c.setVisible(true);
    }

}

