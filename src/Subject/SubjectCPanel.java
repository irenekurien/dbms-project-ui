package Subject;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.Utils;

import net.miginfocom.swing.MigLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class SubjectCPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton createButton;
	private JButton cancelButton;
	private JTextField subjectNameTF;
	private JTextField subjectCodeTF;
	private JLabel subjectNameLabel;
	private JLabel subjectCodeLabel;

	/**
	 * Create the panel.
	 */
	public SubjectCPanel() {
		setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));
		
		subjectNameLabel = new JLabel("Subject Name");
		add(subjectNameLabel, "flowx,cell 0 1");
		
		subjectNameTF = new JTextField();
		subjectNameTF.setToolTipText("Enter the Subject Name");
		subjectNameLabel.setLabelFor(subjectNameTF);
		add(subjectNameTF, "cell 0 2,growx");
		subjectNameTF.setColumns(10);
		
		subjectCodeLabel = new JLabel("Subject Code");
		add(subjectCodeLabel, "cell 0 3");
		
		subjectCodeTF = new JTextField();
		subjectCodeTF.setToolTipText("Enter the subject code");
		subjectCodeLabel.setLabelFor(subjectCodeTF);
		add(subjectCodeTF, "cell 0 4,growx");
		subjectCodeTF.setColumns(10);
				
		createButton = new JButton("Create Subject");
		createButton.setBackground(Color.GREEN);
		add(createButton, "flowx,cell 0 7,alignx center,aligny top");
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBackground(Color.RED);
		add(cancelButton, "cell 0 7,alignx center,aligny top");
		
		addActionListener();
	}
	
	private void addActionListener() {
		createButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		Utils helper = new Utils();
		JTextField fields[] = {subjectNameTF, subjectCodeTF};
		
		if(source == createButton)
			helper.getInputValues(fields);

		else if(source == cancelButton)
			helper.resetInputValues(fields);
	}	

}
