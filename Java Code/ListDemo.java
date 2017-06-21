// demonstrate a simple JList

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class ListDemo implements ListSelectionListener {
	
	JList<String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;
	
	// create an array of names.
	String names[] = {"Sherry", "Jon", "Rachel", "Sasha", "Josselyn", "Randy",
	"Tom", "Mary", "Ken", "Andrew", "Matt", "Todd" };
	
	ListDemo() {
		// create a new jframe container
		JFrame jfrm = new JFrame("JList demo");
		
		//specify a flow layout.
		jfrm.setLayout(new FlowLayout());
		
		// give the frame an initial size
		jfrm.setSize(200, 160);
		
		// terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a JList
		jlst = new JList<String>(names);
		
		//set the list selection mode to single selection.
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// add list to a scroll pane
		jscrlp = new JScrollPane(jlst);
		
		// set the preferred size of the scroll pane
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
		// make a label that displays the selection.
		jlab = new JLabel("Please choose a name");
		
		// add list selection handler 
		jlst.addListSelectionListener(this);
		
		//add the list and label to the content pane.
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		
		// display the frame.
		jfrm.setVisible(true);
	}
	
	// handle list selection events.
	public void valueChanged(ListSelectionEvent le) {
		// get the index of the changed item.
		int idx = jlst.getSelectedIndex();
		// display selection, if item was selected.
		if(idx != -1)
			jlab.setText("Current selection: " + names[idx]);
		else // otherwise repromt.
			jlab.setText("Please choose a name");
	}
	
	public static void main(String args[]) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ListDemo();
			}
		});
	}
}