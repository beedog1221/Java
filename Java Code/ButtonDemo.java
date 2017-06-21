// demonstrate a push botton and handle action events.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {
	JLabel jlab;
	
	ButtonDemo() {
		
		// create a new Jframe container
		JFrame jfrm = new JFrame("A Button Example");
		
		// specify flowlayout for the layout manager
		jfrm.setLayout(new FlowLayout());
		
		//give the frame an initial size.
		jfrm.setSize(220, 90);
		
		// terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//make two buttons.
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		// add action listeners.
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
		// add the buttons to the content pane
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);
		
		// create a label
		jlab = new JLabel("Press a button.");
		
		// add the label to the frame.
		jfrm.add(jlab);
		
		//display the frame.
		jfrm.setVisible(true);
	}
	
	//handle button events.
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up.");
		else
			jlab.setText("you pressed down.");
	}
	
	public static void main(String args[]) {
		// create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}
		});
	}
}