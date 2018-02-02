package gui;

import model.PhoneBook;
import model.Contact;
import database.ContactOperations;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class AddGUI extends JFrame implements ActionListener{
	private JPanel p1,p2;
	private JTextField nameF, addF, phoneF,emailF;
	private JButton ok;
	private JDialog addD;
	private ContactOperations co;
    private PhoneBook p;
	
	public AddGUI(JFrame parent,PhoneBook p,ContactOperations co)
	{
		addD = new JDialog(parent,true);
		addD.setSize(250, 250);
	  	addD.setTitle("Mortgage Application");
	  	addD.setLocationRelativeTo(null);
	  	addD.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	  
	  	this.co= co;
        this.p = p;
	   	
	  	p1 = new JPanel(new GridLayout(4,2));	  	  	
	  	p1.add(new Label("Name:"));
	  	nameF = new JTextField(10);
	  	p1.add(nameF);
	  	
	  	p1.add(new Label("Address: "));
	  	addF = new JTextField(20);
	  	p1.add(addF);
	  	
	  	p1.add(new Label("Phone:"));
	  	phoneF = new JTextField(20);
	  	p1.add(phoneF);
	  	
	  	p1.add(new Label("E-mail:"));
	  	emailF = new JTextField(20);
	  	p1.add(emailF);
	  	

	  	p1.setBorder(new TitledBorder("Contact Details"));
	  	addD.add(p1, BorderLayout.CENTER);
	  	
	  	p2 = new JPanel();
	  	ok = new JButton("OK");
	  	ok.addActionListener(this);
		p2.add(ok);
		
		addD.add(p2,BorderLayout.SOUTH);
		addD.setVisible(true);
	  	
	}

    public void addnewContact(){
        String name = nameF.getText();
        String address = addF.getText();
        String phone = phoneF.getText();
        String email = emailF.getText();

        if(nameF.getText().equals("") ||addF.getText().equals("")||phoneF.getText().equals("")||emailF.getText().equals("")){

            JOptionPane.showMessageDialog(null,"Please enter all details");
            nameF.setText("");
            nameF.requestFocus();
        }else{
            // Create a Contact object and pass it to ContactOperations to save it
            Contact c = new Contact(name,address,phone,email);
            co.addContact(c);
            p.addContactModel();
            JOptionPane.showMessageDialog(null,"Person Saved");
            addD.setVisible(false);
        }
    }

	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == ok)
		{
			addnewContact();
			addD.setVisible(false);
		}
	}
}
