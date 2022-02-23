package com;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class FacultyCreation extends Frame implements ActionListener {

	/**
	 * extending Frame makes this class a serializable class
	 */
	private static final long serialVersionUID = 1L;
	private JFrame facutltyRegFrm;
	private JTextField contactNumberTF;
	private JTextField facultyfacultyNameTF;
	private JButton registerButton;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyCreation window = new FacultyCreation();
					window.facutltyRegFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FacultyCreation() {
		initialize();
		addActionListener();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		facutltyRegFrm = new JFrame();
		facutltyRegFrm.setTitle("Facutlty Registeration");
		facutltyRegFrm.setBounds(100, 100, 450, 300);
		facutltyRegFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		facutltyRegFrm.getContentPane().setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));
		
		JPanel headingPanel = new JPanel();
		facutltyRegFrm.getContentPane().add(headingPanel, "cell 0 0,growx,aligny top");
		
		JLabel createStudentLabel = new JLabel("Create Faculty");
		headingPanel.add(createStudentLabel);
		
		JLabel facultyNameLabel = new JLabel("Faculty Name");
		facutltyRegFrm.getContentPane().add(facultyNameLabel, "flowx,cell 0 1");
		
		facultyfacultyNameTF = new JTextField();
		facultyfacultyNameTF.setToolTipText("Enter your name");
		facultyNameLabel.setLabelFor(facultyfacultyNameTF);
		facutltyRegFrm.getContentPane().add(facultyfacultyNameTF, "cell 0 2,growx");
		facultyfacultyNameTF.setColumns(10);
		
		JLabel contactNoLabel = new JLabel("Contact Number");
		facutltyRegFrm.getContentPane().add(contactNoLabel, "cell 0 3");
		
		contactNumberTF = new JTextField();
		contactNumberTF.setToolTipText("Enter your phone number with country code");
		contactNumberTF.setText("+91 ");
		contactNoLabel.setLabelFor(contactNumberTF);
		facutltyRegFrm.getContentPane().add(contactNumberTF, "cell 0 4,growx");
		contactNumberTF.setColumns(10);
		
		registerButton = new JButton("Register");
		registerButton.setBackground(Color.GREEN);
		facutltyRegFrm.getContentPane().add(registerButton, "flowx,cell 0 7,alignx center,aligny top");
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(Color.RED);
		facutltyRegFrm.getContentPane().add(cancelButton, "cell 0 7,alignx center,aligny top");
			}

	private void addActionListener() {
		registerButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == registerButton)
		{
			String facultyName = facultyfacultyNameTF.getText();
			String contactNumber = contactNumberTF.getText();
			
			System.out.print(facultyName + " " + contactNumber);
		}
		else if(source == cancelButton)
		{
			// go back to home page
		}	
	}
}
