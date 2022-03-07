package Subject;

import java.awt.Color;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.Utils;

import net.miginfocom.swing.MigLayout;

public class SubjectRDPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public SubjectRDPanel() {
		setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));

		Utils helper = new Utils();
	    String[] subjects = {"Computer Networks", "System Software", "Operating System", "Disaster Management"}; 
	    String[] buttonLabel = new String[subjects.length];
	    Arrays.fill(buttonLabel, "Delete");

		JLabel[] labels = helper.createLabels(subjects.length, subjects);
		JButton[] buttons = helper.createButtons(subjects.length, buttonLabel, Color.RED);
		
        for (int i=0;i<labels.length;i++) {
        	String cellVal = "cell 0 " + i;
            this.add(labels[i], cellVal);
            this.add(buttons[i]);
        }
	}
}
