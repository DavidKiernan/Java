package Exercise2;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by David on 20/03/2015.
 */
public class Exercise2GUI extends JFrame {
    final static int HOST = 10;
    final static int WEEKNUMBER = 4;
    final static int GUESTS = 4;
    final static int RECORDSIZE = (HOST + WEEKNUMBER+GUESTS);

    private static final int FRAME_WIDTH = 390;
    private static final int FRAME_HEIGHT = 200;
    private JButton enterWeekNumber = new JButton("Enter Week Number");
    private JButton exit = new JButton("Exit");
    private JTextField host = new JTextField(), weekNumber= new JTextField(), guest= new JTextField();
    private JPanel top = new JPanel(new GridLayout(5,2));
    private JPanel bottem = new JPanel(new FlowLayout());
    private JLabel eventsHost = new JLabel("Enter this month's events Hosts");
    private JLabel weekNum= new JLabel("Week Number");
    private JLabel guests = new JLabel("Guests");

    private RandomAccessFile raf;

    public Exercise2GUI (){
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
        enterWeekNumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                // Similar to Exercise 1 the weekNumber is done twice once to get the text and another to set the Int
                // This is done as the raf.readInt will read the 1st int so I assumed that this is what to do.
                // There maybe a different way to do it but I'm not sure.
                    Integer.parseInt(weekNumber.getText());
                    raf.seek((Integer.parseInt(weekNumber.getText())-1) * RECORDSIZE);
                    host.setText(raf.readUTF());
                    weekNumber.setText(Integer.toString(raf.readInt()));
                    guest.setText(Integer.toString(raf.readInt()));

                }catch (IOException el){
                    System.out.println("Error");
                }
            }
        });
        bottem.add(enterWeekNumber);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bottem.add(exit);


    }
}
