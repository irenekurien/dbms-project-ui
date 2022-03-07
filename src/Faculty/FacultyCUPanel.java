package Faculty;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.Utils;

import net.miginfocom.swing.MigLayout;

public class FacultyCUPanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JTextField contactNumberTF;
	private JTextField facultyNameTF;
	private JTextField facultyIdTF;
	private JButton registerButton;
	private JButton cancelButton;
	private JCheckBox isUpdatingFaculty;

	
	/**
	 * Create the panel.
	 */
	public FacultyCUPanel() {
		setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));

		JLabel facultyNameLabel = new JLabel("Faculty Name");
		add(facultyNameLabel, "flowx,cell 0 1");

		facultyNameTF = new JTextField();
		facultyNameTF.setToolTipText("Enter your name");
		facultyNameLabel.setLabelFor(facultyNameTF);
		add(facultyNameTF, "cell 0 2,growx");
		facultyNameTF.setColumns(10);

		JLabel contactNoLabel = new JLabel("Contact Number");
		add(contactNoLabel, "cell 0 3");

		contactNumberTF = new JTextField();
		contactNumberTF.setToolTipText("Enter your phone number with country code");
		contactNoLabel.setLabelFor(contactNumberTF);
		add(contactNumberTF, "cell 0 4,growx");
		contactNumberTF.setColumns(10);
		
		JLabel facultyIdLabel = new JLabel("Faculty ID");
		add(facultyIdLabel, "cell 0 5");
		
		facultyIdTF = new JTextField();
		facultyIdTF.setToolTipText("Enter the faculty ID");
		facultyIdLabel.setLabelFor(facultyIdTF);
		facultyIdTF.setEnabled(false);
		add(facultyIdTF, "cell 0 6,growx");
		facultyIdTF.setColumns(10);
		
		isUpdatingFaculty = new JCheckBox("Update faculty");
		add(isUpdatingFaculty, "cell 0 7");

		registerButton = new JButton("Register");
		registerButton.setBackground(Color.GREEN);
		add(registerButton, "flowx,cell 0 8,alignx center,aligny top");

		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(Color.RED);
		add(cancelButton, "cell 0 8,alignx center,aligny top");
		
		addActionListener();
	}

	private void addActionListener() {
		isUpdatingFaculty.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
                	facultyIdTF.setEnabled(true);
                
                else if(e.getStateChange() == ItemEvent.DESELECTED)
                	facultyIdTF.setEnabled(false);

                validate();
                repaint();
            }
        });

		registerButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
				
		Utils helper = new Utils();
		JTextField fields[] = {facultyNameTF, contactNumberTF, null};
		
		if(facultyIdTF.isEnabled())
			fields[2] = facultyIdTF;
		
		if(source == registerButton)
			helper.getInputValues(fields);

		else if(source == cancelButton)
			helper.resetInputValues(fields);
	}
}
