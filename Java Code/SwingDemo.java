// a simple swing program

import javax.swing.*;

class SwingDemo {
	SwingDemo() {
		
		// create a new jframe container.
		JFrame jfrm = new JFrame("A Simple Swing Application");
		
		// give the frame an initial size.
		jfrm.setSize(800, 300);
		
		// terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a text based label
		JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");
		
		// add the label to the content pane
		jfrm.add(jlab);
		
		//display the frame
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}