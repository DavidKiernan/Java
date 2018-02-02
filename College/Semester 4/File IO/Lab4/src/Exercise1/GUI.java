package Exercise1;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;
//EXERCISE 2 PRETTY MUCH THE SAME CHANGE WriteUTF() to Read
/**
 * Created by x00093830 on 18/03/2015.
 */
public class GUI extends JFrame {
    final static int HOST = 10;
    final static int WEEKNUMBER = 4;
    final static int GUESTS = 4;
    final static int RECORDSIZE = (HOST + WEEKNUMBER+GUESTS);

    private static final int FRAME_WIDTH = 390;
    private static final int FRAME_HEIGHT = 200;
    private JButton enterData = new JButton("Enter Data");
    private JButton exit = new JButton("Exit");
    private JTextField host = new JTextField(), weekNumber= new JTextField(), guest= new JTextField();
    private JPanel top = new JPanel(new GridLayout(5,2));
    private JPanel bottem = new JPanel(new FlowLayout());
    private JLabel eventsHost = new JLabel("Enter this month's events Hosts");
    private JLabel weekNum= new JLabel("Week Number");
    private JLabel guests = new JLabel("Guests");

    private RandomAccessFile raf;


    public GUI(){
        try {
            raf = new RandomAccessFile("files/events.dat","rw");
        }
        catch(IOException ex) {
            System.out.print("Error: " + ex);
            System.exit(0);
        }

        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Event File");

        add(top,BorderLayout.NORTH);
        top.setBorder(new TitledBorder("Event Handlers Incorporated"));
        top.add(eventsHost);
        host.setEditable(true);



        top.add(host);
        top.add(weekNum);
        weekNumber.setEditable(true);
        top.add(weekNumber);
        top.add(guests);

        guest.setEditable(true);
        top.add(guest);

        add(bottem,BorderLayout.SOUTH);
        enterData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    host.getText();
                    Integer.parseInt(weekNumber.getText());
                    Integer.parseInt(guest.getText());
                    raf.seek((Integer.parseInt(weekNumber.getText())-1) * RECORDSIZE);
                    raf.writeUTF(host.getText());
                    raf.writeInt(Integer.parseInt(weekNumber.getText()));
                    raf.writeInt(Integer.parseInt(guest.getText()));
                }catch (IOException el){
                    System.out.println("Error");
                }
            }
        });
        bottem.add(enterData);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bottem.add(exit);


    }
}
