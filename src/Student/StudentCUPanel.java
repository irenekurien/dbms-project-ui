package Student;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.Utils;

import net.miginfocom.swing.MigLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class StudentCUPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton registerButton;
	private JButton cancelButton;
	private JLabel studentNameLabel;
	private JLabel contactNoLabel;
	private JLabel studentIdLabel;
	private JTextField studentNameTF;
	private JTextField contactNumberTF;
	private JTextField dobTF;
	private JTextField studentIdTF;
	private JCheckBox isUpdatingStudent;


	/**
	 * Create the panel.
	 */
	public StudentCUPanel() {
		setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][][][][21px][21px]"));
		
		studentNameLabel = new JLabel("Student Name");
		add(studentNameLabel, "flowx,cell 0 1");
		
		studentNameTF = new JTextField();
		studentNameTF.setToolTipText("Enter your name");
		studentNameLabel.setLabelFor(studentNameTF);
		add(studentNameTF, "cell 0 2,growx");
		studentNameTF.setColumns(10);
		
		contactNoLabel = new JLabel("Contact Number");
		add(contactNoLabel, "cell 0 3");
		
		contactNumberTF = new JTextField();
		contactNumberTF.setToolTipText("Enter your phone number with country code");
		contactNumberTF.setText("+91 ");
		contactNoLabel.setLabelFor(contactNumberTF);
		add(contactNumberTF, "cell 0 4,growx");
		contactNumberTF.setColumns(10);
		
		JLabel dobLabel = new JLabel("Date of Birth");
		add(dobLabel, "cell 0 5");
		
		dobTF = new JTextField();
		dobTF.setToolTipText("Enter your date of birth in dd/mm/yyyy format");
		dobLabel.setLabelFor(dobTF);
		add(dobTF, "cell 0 6,growx");
		dobTF.setColumns(10);
		
		studentIdLabel = new JLabel("Student ID");
		add(studentIdLabel, "cell 0 7");
		
		studentIdTF = new JTextField();
		studentIdTF.setToolTipText("Enter the student ID");
		studentIdLabel.setLabelFor(studentIdTF);
		studentIdTF.setEnabled(false);
		add(studentIdTF, "cell 0 8,growx");
		studentIdTF.setColumns(10);
		
		isUpdatingStudent = new JCheckBox("Update Student");
		add(isUpdatingStudent, "cell 0 9");
		
		registerButton = new JButton("Register");
		registerButton.setBackground(Color.GREEN);
		add(registerButton, "flowx,cell 0 10,alignx center,aligny top");
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(Color.RED);
		add(cancelButton, "cell 0 10,alignx center,aligny top");
		
		addActionListener();
	}
	
	private void addActionListener() {
		isUpdatingStudent.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
                	studentIdTF.setEnabled(true);
                
                else if(e.getStateChange() == ItemEvent.DESELECTED)
                	studentIdTF.setEnabled(false);

                validate();
                repaint();
            }
        });
		
		registerButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		Utils helper = new Utils();
		JTextField fields[] = {studentNameTF, contactNumberTF, dobTF, null};
		
		if(studentIdTF.isEnabled())
			fields[3] = studentIdTF;
		
		if(source == registerButton)
			helper.getInputValues(fields);

		else if(source == cancelButton)
			helper.resetInputValues(fields);
	}	

}
