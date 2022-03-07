package Faculty;

import java.awt.Color;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.Utils;

import net.miginfocom.swing.MigLayout;

public class FacultyRDPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public FacultyRDPanel() {
		setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));

		Utils helper = new Utils();
	    String[] names = {"Irene", "Jacob", "Sidharth"}; 
	    String[] buttonLabel = new String[names.length];
	    Arrays.fill(buttonLabel, "Delete");

		JLabel[] labels = helper.createLabels(names.length, names);
		JButton[] buttons = helper.createButtons(names.length, buttonLabel, Color.RED);
		
        for (int i=0;i<labels.length;i++) {
        	String cellVal = "cell 0 " + i;
            this.add(labels[i], cellVal);
            this.add(buttons[i]);
        }
	}
}
