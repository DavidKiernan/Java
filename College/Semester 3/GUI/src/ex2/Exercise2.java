import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by David on 23/11/2014.
 */
public class Exercise2 extends JFrame {
    private final int WIN_WIDTH = 300;
    private final int WIN_HEIGHT = 250;

    private JButton addB, clear;
    private JLabel label;
    private JTextArea textArea;
    private JTextField field1;
    private String texts;
    private Container con;

    public Exercise2() {
        con=getContentPane();
        con.setBackground(Color.PINK);
        setLayout(new BorderLayout());
        setTitle("TextArea Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        addB = new JButton("Add");
        add(addB);
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1;
                String text = field1.getText();
                t1 = String.format(text);
                textArea.setText(String.format(t1));
            }
        });
        clear = new JButton("Clear");
        add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                texts = "";
                textArea.setText(String.format(texts));
            }
        });
        field1 = new JTextField("Please enter your message here",20);
        add(field1);
        textArea = new JTextArea(6,20);
        textArea.setLineWrap(true);
        textArea.setBorder(BorderFactory.createLineBorder(Color.red));
        textArea.setEditable (false);
        add(textArea);

        setSize(WIN_WIDTH,WIN_HEIGHT);
    }
    public static void main(String[]args) {
        Exercise2 c = new Exercise2();
        c.setVisible(true);
    }
}

