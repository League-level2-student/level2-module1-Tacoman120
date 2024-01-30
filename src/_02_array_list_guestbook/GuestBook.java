package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String> list = new ArrayList<String>();
	
	void run() {
		list.add("Bob Banders");
		list.add("Sandy Summers");
		list.add("Greg Ganders");
		list.add("Donny Doners");
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setName("Guest Book");
		panel.add(add);
		add.setText("Add Name");
		panel.add(view);
		view.setText("View Names");
		frame.pack();
		add.addActionListener(this);
		view.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add) {
			String addition = JOptionPane.showInputDialog(null, "Enter a name (first and last)");
			list.add(addition);
		}
		if(e.getSource() == view) {
			
		}
	}
	
}


