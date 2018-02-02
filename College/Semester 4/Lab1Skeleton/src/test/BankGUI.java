package test;

import model.Bank;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by x00093830 on 28/01/2015.
 */
public class BankGUI extends JFrame{

    private static final int WINDOW_HEIGHT = 350;
    private static final int WINDOW_WIDTH = 600;

    private Dimension d1 = new Dimension(WINDOW_WIDTH,100);
    private Dimension d2 = new Dimension(WINDOW_WIDTH,50);
    private Dimension d3 = new Dimension(300,50);

    private JButton interest = new JButton("Apply Interest"), exit = new JButton("Exit");
    private JTextArea window = new JTextArea();
    private JCheckBox savings = new JCheckBox("Savings"),current = new JCheckBox("Current");
    private JPanel pan1,pan2,pan3,pan4;
    private JScrollPane forWindow = new JScrollPane(window);
    Font f = new Font("Verdana", Font.ITALIC,30);


    private JFrame frame;


public BankGUI(Bank bank){
    frame = new JFrame();
    frame.setTitle("Banking Application");
    frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());



    //Panel 1 top
    pan1 = new JPanel();

    JLabel title = new JLabel("Welcome to Banking",SwingConstants.CENTER);
    pan1.setBorder(new LineBorder(Color.RED));
    title.setForeground(Color.RED);
    title.setPreferredSize(d2);
    title.setFont(f);
    pan1.add(title);
    frame.add(pan1, BorderLayout.NORTH);

    // Panel 2 text area

    pan2 = new JPanel();
    forWindow.setPreferredSize(d1);
    forWindow.setAutoscrolls(true);
    pan2.add(forWindow);
    frame.add(pan2);

    //Panel 3#

    frame.add(savings);

    savings.setSelected(false);
    savings.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (savings.isSelected()){
                window.setText(String.format(bank.getDetails("Savings")));

            }

        }
    });
    frame.add(pan3);








    frame.setVisible(true);



}


}
