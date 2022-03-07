package Course;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.Utils;

import net.miginfocom.swing.MigLayout;

public class CourseCUPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton createCourseButton;
	private JButton cancelButton;
	private JLabel selectClassroomLabel;
	private JComboBox<?> selectFacultyDD;
	private JComboBox<?> selectSubjectDD;
	private JComboBox<?> selectClassroomDD;

	/**
	 * Create the panel.
	 */
	public CourseCUPanel() {
		setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));

		JLabel selectFacultyLabel = new JLabel("Select Faculty");
		selectFacultyLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(selectFacultyLabel, "flowx,cell 0 1");

	    String country[]={"India","Aus","U.S.A","England","Newzealand"};        
		selectFacultyDD = new JComboBox<Object>(country);
		add(selectFacultyDD, "cell 0 2,growx");

		JLabel selectSubjectLabel = new JLabel("Select Subject");
		add(selectSubjectLabel, "cell 0 3");

		selectSubjectDD = new JComboBox<Object>();
		add(selectSubjectDD, "cell 0 4,growx");

		selectClassroomLabel = new JLabel("Select Classroom");
		add(selectClassroomLabel, "cell 0 5");

		selectClassroomDD = new JComboBox<Object>();
		add(selectClassroomDD, "cell 0 6,growx");

		createCourseButton = new JButton("Create Course");
		createCourseButton.setBackground(Color.GREEN);
		add(createCourseButton, "flowx,cell 0 8,alignx center,aligny top");

		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(Color.RED);
		add(cancelButton, "cell 0 8,alignx center,aligny top");
		
		addActionListener();
	}

	private void addActionListener() {
		createCourseButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Object source = e.getSource();
//		
//		Utils helper = new Utils();
//		JTextField fields[] = {facultyNameTF, contactNumberTF, null};		
//		
//		if(source == createCourseButton)
//			helper.getInputValues(fields);
//
//		else if(source == cancelButton)
//			helper.resetInputValues(fields);
	}

}
