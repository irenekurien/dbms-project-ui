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

public class SubjectCreation extends Frame implements ActionListener {

	/**
	 * extending Frame makes this class a serializable class
	 */
	private static final long serialVersionUID = 1L;
	private JFrame subjectCreationFrm;
	private JTextField subjectCodeTF;
	private JTextField subjectNameTF;
	private JButton allocateFacultyButton;
	private JButton cancelButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubjectCreation window = new SubjectCreation();
					window.subjectCreationFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SubjectCreation() {
		initialize();
		addActionListener();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		subjectCreationFrm = new JFrame();
		subjectCreationFrm.setTitle("Create New Subject");
		subjectCreationFrm.setBounds(100, 100, 450, 300);
		subjectCreationFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		subjectCreationFrm.getContentPane().setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));
		
		JPanel headingPanel = new JPanel();
		subjectCreationFrm.getContentPane().add(headingPanel, "cell 0 0,growx,aligny top");
		
		JLabel createSubjectLabel = new JLabel("Create New Subject");
		headingPanel.add(createSubjectLabel);
		
		JLabel subjectNameLabel = new JLabel("Subject Name");
		subjectCreationFrm.getContentPane().add(subjectNameLabel, "flowx,cell 0 1");
		
		subjectNameTF = new JTextField();
		subjectNameTF.setToolTipText("Enter the subject name");
		subjectNameLabel.setLabelFor(subjectNameTF);
		subjectCreationFrm.getContentPane().add(subjectNameTF, "cell 0 2,growx");
		subjectNameTF.setColumns(10);
		
		JLabel subjectCodeLabel = new JLabel("Subject Code");
		subjectCreationFrm.getContentPane().add(subjectCodeLabel, "cell 0 3");
		
		subjectCodeTF = new JTextField();
		subjectCodeTF.setToolTipText("Enter the subject code");
		subjectCodeLabel.setLabelFor(subjectCodeTF);
		subjectCreationFrm.getContentPane().add(subjectCodeTF, "cell 0 4,growx");
		subjectCodeTF.setColumns(10);
		
		allocateFacultyButton = new JButton("Allocate Faculty");
		allocateFacultyButton.setBackground(Color.GREEN);
		subjectCreationFrm.getContentPane().add(allocateFacultyButton, "flowx,cell 0 7,alignx center,aligny top");
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(Color.RED);
		subjectCreationFrm.getContentPane().add(cancelButton, "cell 0 7,alignx center,aligny top");
	}	
	
	private void addActionListener() {
		allocateFacultyButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == allocateFacultyButton)
		{
			String subjectName = subjectNameTF.getText();
			String subjectCode = subjectCodeTF.getText();
			
			System.out.print(subjectName + " " + subjectCode);
		}
		else if(source == cancelButton)
		{
			// go back to home page
		}
	}	
}

