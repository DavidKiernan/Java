package mortgage;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import mortgage.Mortgage;

/**
 * Created by David on 01/12/2014.
 */
public class MorGUI {

    private static final int FRAME_WIDTH = 390;
    private static final int FRAME_HEIGHT = 200;
    private static int counter=0;

    private JButton compute, clear,quit;

    private JTextField interest, years, loan, monthly,total;

    private DecimalFormat dec = new DecimalFormat("###,###.##");

    private Mortgage mort;

     JFrame f;

    public MorGUI(){
        f = new JFrame();
        f.setTitle("Mortgage Application");
        f.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


  // below is for the boarder layout using GridLayout

        JPanel top = new JPanel(new GridLayout(5,2));
        f.add(top, BorderLayout.NORTH);
        top.setBorder(new TitledBorder("Enter interest rate, year and loan amount"));
        top.add(new JLabel("Interest Rate %"));
        interest = new JTextField();
        interest.setEditable(true);
        top.add(interest);
        top.add(new JLabel("Years"));
        years = new JTextField();
        years.setEditable(true);
        top.add(years);
        top.add(new JLabel("Loan Amount"));
        loan= new JTextField();
        loan.setEditable(true);
        top.add(loan);
        top.add(new JLabel("Monthly Payment"));
        monthly = new JTextField();
        monthly.setEditable(false);
        top.add(monthly);
        top.add(new JLabel("Total Payment"));
        total = new JTextField();
        total.setEditable(false);
        top.add(total);

     // Below is for the buttons using a FlowLayout

        JPanel bottom = new JPanel(new FlowLayout());
        f.add(bottom,BorderLayout.SOUTH);
        compute = new JButton("Compute Mortgage");
        compute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double inter,loanA;
                int yrs;
                try {
                    inter = Double.parseDouble(interest.getText());
                    yrs = Integer.parseInt(years.getText());
                    loanA = Double.parseDouble(loan.getText());
                    counter++;
                    mort = new Mortgage(counter,inter,yrs,loanA);

                    monthly.setText("€"+dec.format(mort.monthlyPay()));
                    total.setText("€"+dec.format(mort.totalPay()));
                    counter ++;
                }catch (NumberFormatException i){
                    JOptionPane.showMessageDialog(null,"You must enter valid data","Warning",JOptionPane.WARNING_MESSAGE);
                }

            }
        });
        bottom.add(compute);


        clear = new JButton("Clear Text");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interest.setText("");
                years.setText("");
                loan.setText("");
                monthly.setText("");
                total.setText("");
            }
        });
        bottom.add(clear);

        quit = new JButton("Quit");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bottom.add(quit);

    }
}
