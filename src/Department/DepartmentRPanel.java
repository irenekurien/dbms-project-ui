package Department;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.Utils;

import net.miginfocom.swing.MigLayout;

public class DepartmentRPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public DepartmentRPanel() {
		setLayout(new MigLayout("", "[422px,grow]", "[23px][][][][][][][21px][21px]"));

		Utils helper = new Utils();
	    String[] depts = {"CSE", "ECE", "ME", "CE", "EEE"}; 
		JLabel[] labels = helper.createLabels(depts.length, depts);
		
        for (int i=0;i<labels.length;i++) {
        	String cellVal = "cell 0 " + i;
            this.add(labels[i], cellVal);
        }
	}
}
