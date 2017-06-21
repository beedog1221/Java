// use  a text field.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TFDemo implements ActionListener {
	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;
	
	TFDemo() {
		
		// creat a new jframe container
		JFrame jfrm = new JFrame("Use a Text Field");
		
		// specify flowlayout for the layout manager.
		jfrm.setLayout(new FlowLayout());
		
		// give the frame an initial size
		jfrm.setSize(240, 120);
		
		// terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a text field
		jtf = new JTextField(10);
		
		//set the action commands for the text field
		jtf.setActionCommand("myTF");
		
		// create the reverse button
		JButton jbtnRev = new JButton("Reverse");
		
		// add action listeners.
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);
		
		//create the labels
		jlabPrompt = new JLabel("enter text: ");
		jlabContents = new JLabel("");
		
		// add the components to the content pane
		jfrm.add(jlabPrompt);
		jfrm.add(jtf);
		jfrm.add(jbtnRev);
		jfrm.add(jlabContents);
		
		// display the frame
		jfrm.setVisible(true);
	}
	
	// handle action events.
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Reverse")) {
			// the reverse button was pressed.
			String orgStr = jtf.getText();
			String resStr = "";
			
			// store the reversed string in the text field.
			jtf.setText(resStr);
		}else
			// enter was pressed while focus was in the text field.
		jlabContents.setText("You pressed ENTER. text is: " + jtf.getText());
	}
	
	public static void main (String args[]) {
		//create the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TFDemo();
			}
		});
	}
}