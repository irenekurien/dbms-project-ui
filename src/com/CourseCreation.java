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
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class CourseCreation extends Frame implements ActionListener {

	/**
	 * extending Frame makes this class a serializable class
	 */
	private static final long serialVersionUID = 1L;
	private JFrame courseCreationFrm;
	private JButton createCourseButton;
	private JButton cancelButton;
	private JLabel selectClassroomLabel;
	private JComboBox<?> selectFacultyDD;
	private JComboBox<?> selectSubjectDD;
	private JComboBox<?> selectClassroomDD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseCreation window = new CourseCreation();
					window.courseCreationFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CourseCreation() {
		initialize();
		addActionListener();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		courseCreationFrm = new JFrame();
		courseCreationFrm.setTitle("Course Creation");
		courseCreationFrm.setBounds(100, 100, 450, 300);
		courseCreationFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		courseCreationFrm.getContentPane().setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));
		
		JPanel headingPanel = new JPanel();
		courseCreationFrm.getContentPane().add(headingPanel, "cell 0 0,growx,aligny top");
		
		JLabel createCourseLabel = new JLabel("Create a New Course");
		headingPanel.add(createCourseLabel);
		
		JLabel selectFacultyLabel = new JLabel("Select Faculty");
		selectFacultyLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		courseCreationFrm.getContentPane().add(selectFacultyLabel, "flowx,cell 0 1");
		
		selectFacultyDD = new JComboBox();
		courseCreationFrm.getContentPane().add(selectFacultyDD, "cell 0 2,growx");
		
		JLabel selectSubjectLabel = new JLabel("Select Subject");
		courseCreationFrm.getContentPane().add(selectSubjectLabel, "cell 0 3");
		
		selectSubjectDD = new JComboBox();
		courseCreationFrm.getContentPane().add(selectSubjectDD, "cell 0 4,growx");
		
		selectClassroomLabel = new JLabel("Select Classroom");
		courseCreationFrm.getContentPane().add(selectClassroomLabel, "cell 0 5");
		
		selectClassroomDD = new JComboBox();
		courseCreationFrm.getContentPane().add(selectClassroomDD, "cell 0 6,growx");
		
		createCourseButton = new JButton("Create Course");
		createCourseButton.setBackground(Color.GREEN);
		courseCreationFrm.getContentPane().add(createCourseButton, "flowx,cell 0 8,alignx center,aligny top");
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(Color.RED);
		courseCreationFrm.getContentPane().add(cancelButton, "cell 0 8,alignx center,aligny top");
	}
	
	private void addActionListener() {
		createCourseButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == createCourseButton)
		{			
		}
		else if(source == cancelButton)
		{
			// go back to home page
		}	
	}
}
