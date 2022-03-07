package com;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Utils {
	
	public JLabel[] createLabels(int n, String[] val) {
        JLabel[] labels = new JLabel[n];
        
        for (int i=0; i<n; i++) {
            labels[i] = new JLabel(val[i]);
        }
        return labels;
    }
	
	public JButton[] createButtons(int n, String[] val, Color color) {
		JButton[] buttons = new JButton[n];
        
        for (int i=0; i<n; i++) {
        	buttons[i] = new JButton(val[i]);
        	buttons[i].setBackground(color);
        }
        return buttons;
    }

	public void getInputValues(JTextField[] fields) {
		int n = fields.length;
		String values[] = new String[n];
		
		for (int i=0; i<n; i++) {
			if(fields[i] != null) {
				values[i] = fields[i].getText();
		            
				if(values[i].isEmpty())	{
					JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
					return;
				}
				else System.out.println("values " + values[i] + " ");
			}
        }
	}
	
	public void resetInputValues(JTextField[] fields)	{
		for (int i=0; i<fields.length; i++) {
            fields[i].setText(" ");
        }
	}
}
