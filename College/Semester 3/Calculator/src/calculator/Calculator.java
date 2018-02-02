
package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by David on 25/11/2014.
 */
public class Calculator extends JFrame{

    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 100;

    private JLabel result;

    private JTextField top, bottom;

    private JButton plus, minus, multi,divide, clear,quit;

    private JPanel ri, le;


    public Calculator(){
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        top = new JTextField(10);
        bottom = new JTextField(10);
        ri=new JPanel();
        this.add(ri);
        le=new JPanel();
        this.add(le);
        ri.setLayout(new GridLayout(3, 1));
        ri.add(top);
        ri.add(bottom);



        le.setLayout(new GridLayout(3, 2));
        plus=new JButton("+");
        le.add(plus);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double no1,no2, total;
                try {
                    String text = top.getText();
                    no1 = Double.parseDouble(text);
                    String tex = bottom.getText();
                    no2 = Double.parseDouble(tex);
                    total = no1 + no2;
                    result.setText("" + Double.toString(total));
                }catch(NumberFormatException i){
                   JOptionPane.showMessageDialog(null,"You must enter a number","Error",JOptionPane.WARNING_MESSAGE);
                }

            }
        });

        minus = new JButton("-");
        le.add(minus);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double no1,no2, total;
                try {
                    String text = top.getText();
                    no1 = Double.parseDouble(text);
                    String tex = bottom.getText();
                    no2 = Double.parseDouble(tex);
                    total = no1 - no2;
                    result.setText("" + Double.toString(total));
                }catch(NumberFormatException i){
                    JOptionPane.showMessageDialog(null,"You must enter a number","Error",JOptionPane.WARNING_MESSAGE);
                }

            }
        });

        multi = new JButton("*");
        le.add(multi);
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double no1,no2, total;
                try {
                    String text = top.getText();
                    no1 = Double.parseDouble(text);
                    String tex = bottom.getText();
                    no2 = Double.parseDouble(tex);
                    total = no1 * no2;
                    result.setText("" + Double.toString(total));
                }catch(NumberFormatException i){
                    JOptionPane.showMessageDialog(null,"You must enter a number","Error",JOptionPane.WARNING_MESSAGE);
                }

            }
        });

        divide = new JButton("/");
        le.add(divide);
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double no1,no2, total;
                try {
                    String text = top.getText();
                    no1 = Double.parseDouble(text);
                    String tex = bottom.getText();
                    no2 = Double.parseDouble(tex);
                    total = no1 / no2;
                    result.setText("" + Double.toString(total));
                }catch(NumberFormatException i){
                    JOptionPane.showMessageDialog(null,"You must enter a number","Error",JOptionPane.WARNING_MESSAGE);
                }

            }
        });

        clear = new JButton("CLEAR");
        le.add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                top.setText("");
                bottom.setText("");
                result.setText("");

            }
        });

        quit = new JButton("Quit");
        le.add(quit);
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        result = new JLabel("");
        ri.add(result);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    public static void main(String args[]){
        Calculator c = new Calculator();
        c.setVisible(true);

    }


}



