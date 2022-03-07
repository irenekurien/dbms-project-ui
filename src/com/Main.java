package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;

import Course.*;
import Department.DepartmentRPanel;
import Faculty.*;
import Student.*;
import Subject.*;

import javax.swing.JPanel;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(600, 600, 1250, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "cell 0 0, grow");
		
		StudentCUPanel studentCUPanel = new StudentCUPanel();
		tabbedPane.addTab("Create/Update Student", null, studentCUPanel, null);
		
		StudentRDPanel studentListPanel = new StudentRDPanel();
		tabbedPane.addTab("List Students", null, studentListPanel, null);
		
		FacultyCUPanel facultyCUPanel = new FacultyCUPanel();
		tabbedPane.addTab("Create/Update Faculty", null, facultyCUPanel, null);
		
		FacultyRDPanel facultyListPanel = new FacultyRDPanel();
		tabbedPane.addTab("List Faculty", null, facultyListPanel, null);
		
		DepartmentRPanel departmentRPanel = new DepartmentRPanel();
		tabbedPane.addTab("List Department", null, departmentRPanel, null);
		
		SubjectCPanel subjectCPanel = new SubjectCPanel();
		tabbedPane.addTab("Create Subject", null, subjectCPanel, null);
		
		SubjectRDPanel subjectRDPanel = new SubjectRDPanel();
		tabbedPane.addTab("List Subject", null, subjectRDPanel, null);
		
		CourseCUPanel courseCUPanel = new CourseCUPanel();
		tabbedPane.addTab("Create/Update Course", null, courseCUPanel, null);
		
		CourseRDPanel courseRDPanel = new CourseRDPanel();
		tabbedPane.addTab("List Course", null, courseRDPanel, null);
	}
}
