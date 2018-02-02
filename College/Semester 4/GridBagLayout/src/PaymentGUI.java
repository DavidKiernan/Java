import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by x00093830 on 11/02/2015.
 */
public class PaymentGUI extends JFrame{
    private JRadioButton creditCardRadioButton, billCustomerRadioButton;
    private JList        cardTypeList;
    private JTextField   cardNumberTextField;
    private JComboBox    monthComboBox,yearComboBox;
    private JCheckBox    verifiedCheckBox;
    private JButton      acceptButton,exitButton;
    private JLabel       cardTypeLabel,cardNumberLabel,expirationDateLabel;
   // private GridBagConstraints gc;
    private GridBagLayout layout;

    public PaymentGUI(){
        setTitle("Payment Application");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setSize(350,350);
       // gc = new GridBagConstraints();

        Border loweredBorder= BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        // radio button panel
        JPanel radioPanel = new JPanel();
        ButtonGroup billingGroup = new ButtonGroup();
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        radioPanel.setBorder(BorderFactory.createTitledBorder(loweredBorder,"Billing:"));

        // credit card radio button
        creditCardRadioButton = new JRadioButton("Credit card", true);
        billingGroup.add(creditCardRadioButton);
        radioPanel.add(creditCardRadioButton);

        // bill customer radio button
        billCustomerRadioButton = new JRadioButton("Bill customer");
        billingGroup.add(billCustomerRadioButton);
        radioPanel.add(billCustomerRadioButton);

        add(radioPanel, getConstraints(0,0,3,1, GridBagConstraints.WEST));

        // card type label
        cardTypeLabel = new JLabel("Card Type"); //3
        add(cardTypeLabel,getConstraints(0,3,1,1,GridBagConstraints.EAST));

        // Jlist Code
        String[] cardNames = {"Visa", "Master Card", "American Express", "Other"};
        cardTypeList = new JList(cardNames);
        cardTypeList.setFixedCellWidth(170);
        cardTypeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cardTypeList.setVisibleRowCount(3);
        JScrollPane cardTypeScrollPane = new JScrollPane(cardTypeList);
        add(cardTypeScrollPane, getConstraints(1,3,3,1,GridBagConstraints.EAST));

        // card Number Label
        cardNumberLabel = new JLabel("Card number:");
        add(cardNumberLabel, getConstraints(0,4,1,1,GridBagConstraints.EAST));

        // card number text field
        cardNumberTextField = new JTextField(15);
        add(cardNumberTextField, getConstraints(1,4,2,1,GridBagConstraints.WEST));

        // expiration date label
        expirationDateLabel= new JLabel("Expiration date:");
        add(expirationDateLabel, getConstraints(0,5,1,1,GridBagConstraints.EAST));

        // month combo box
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        monthComboBox = new JComboBox<String>(months);
        add(monthComboBox, getConstraints(1,5,1,1,GridBagConstraints.EAST));

        // year combo box
        String[] years = { "2011", "2012", "2013", "2014", "2015", "2016" };
        yearComboBox = new JComboBox<String>(years);
        add(yearComboBox, getConstraints(2,5,1,1,GridBagConstraints.WEST));



        // verified check box
        verifiedCheckBox = new JCheckBox("Verified");
        add(verifiedCheckBox, getConstraints(1,6,1,1,GridBagConstraints.WEST));

        // calculate button
        acceptButton = new JButton("Accept");
        add(acceptButton, getConstraints(1,7,1,1,GridBagConstraints.EAST));

        // exit button
        exitButton = new JButton("Exit");
        add(exitButton, getConstraints(2,7,1,1,GridBagConstraints.EAST));
    }

    // a  method for setting grid bag constraints
    private GridBagConstraints getConstraints(int gridx, int gridy,
                                              int gridwidth, int gridheight, int anchor)
    {
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridx = gridx;
        c.gridy = gridy;
        c.gridwidth = gridwidth;
        c.gridheight = gridheight;
        c.anchor = anchor;
        return c;
    }

}


