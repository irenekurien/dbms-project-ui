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

public class StudentCreation extends Frame implements ActionListener {

	/**
	 * extending Frame makes this class a serializable class
	 */
	private static final long serialVersionUID = 1L;
	private JFrame studentRegFrm;
	private JTextField contactNumberTF;
	private JTextField studentNameTF;
	private JTextField dobTF;
	private JButton registerButton;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentCreation window = new StudentCreation();
					window.studentRegFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentCreation() {
		initialize();
		addActionListener();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		studentRegFrm = new JFrame();
		studentRegFrm.setTitle("Student Registeration");
		studentRegFrm.setBounds(100, 100, 450, 300);
		studentRegFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentRegFrm.getContentPane().setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));
		
		JPanel headingPanel = new JPanel();
		studentRegFrm.getContentPane().add(headingPanel, "cell 0 0,growx,aligny top");
		
		JLabel createStudentLabel = new JLabel("Create Student");
		headingPanel.add(createStudentLabel);
		
		JLabel studentNameLabel = new JLabel("Student Name");
		studentRegFrm.getContentPane().add(studentNameLabel, "flowx,cell 0 1");
		
		studentNameTF = new JTextField();
		studentNameTF.setToolTipText("Enter your name");
		studentNameLabel.setLabelFor(studentNameTF);
		studentRegFrm.getContentPane().add(studentNameTF, "cell 0 2,growx");
		studentNameTF.setColumns(10);
		
		JLabel contactNoLabel = new JLabel("Contact Number");
		studentRegFrm.getContentPane().add(contactNoLabel, "cell 0 3");
		
		contactNumberTF = new JTextField();
		contactNumberTF.setToolTipText("Enter your phone number with country code");
		contactNumberTF.setText("+91 ");
		contactNoLabel.setLabelFor(contactNumberTF);
		studentRegFrm.getContentPane().add(contactNumberTF, "cell 0 4,growx");
		contactNumberTF.setColumns(10);
		
		JLabel dobLabel = new JLabel("Date of Birth");
		studentRegFrm.getContentPane().add(dobLabel, "cell 0 5");
		
		dobTF = new JTextField();
		dobTF.setToolTipText("Enter your date of birth in dd/mm/yyyy format");
		dobLabel.setLabelFor(dobTF);
		studentRegFrm.getContentPane().add(dobTF, "cell 0 6,growx");
		dobTF.setColumns(10);
		
		registerButton = new JButton("Register");
		registerButton.setBackground(Color.GREEN);
		studentRegFrm.getContentPane().add(registerButton, "flowx,cell 0 7,alignx center,aligny top");
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(Color.RED);
		studentRegFrm.getContentPane().add(cancelButton, "cell 0 7,alignx center,aligny top");
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
			String studentName = studentNameTF.getText();
			String contactNumber = contactNumberTF.getText();
			String dob = dobTF.getText();
			
			System.out.print(studentName + " " + contactNumber + " " + dob);
		}
		else if(source == cancelButton)
		{
			// go back to home page
		}
	}	
}
