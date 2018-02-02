import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by David on 19/11/2014.
 */
public class Exercise1 extends JFrame{
    private final int WIN_WIDTH=300;
    private final int WIN_HEIGHT=300;

    private JButton button;
    private JLabel label;
    private JTextField f1,f2;

    private Container con;

    public Exercise1(){
        con=getContentPane();
        con.setBackground(Color.CYAN);
        setLayout(new BorderLayout());
        setTitle("TextField Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label=new JLabel("Please enter your name");
        add(label);
        f1=new JTextField(20);
        add(f1);
        f2= new JTextField(20);
        add(f2);
        button = new JButton("Enter");
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1;
                String text = f1.getText();
                t1 = String.format(text);
                f2.setText(String.format(t1));
            }
        });

        setSize(WIN_WIDTH,WIN_HEIGHT);

    }
    public static void main(String[]args) {
        Exercise1 c = new Exercise1();
        c.setVisible(true);
    }
}
