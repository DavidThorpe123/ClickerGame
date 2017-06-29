import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Options implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton soundbutton;
	JButton backbutton;
	boolean hasclickedbutton = false;
public static void main(String[] args) {
	Options o = new Options();
}
Options() {
	frame = new JFrame();
	panel = new JPanel();
	soundbutton = new JButton();
	backbutton = new JButton();
	Dimension soundbuttondimension = new Dimension(300, 100);
	Dimension backbuttondimension = new Dimension(300, 100);
	soundbutton.setPreferredSize(soundbuttondimension);
	backbutton.setPreferredSize(backbuttondimension);
	soundbutton.addActionListener(this);
	soundbutton.setText("Music: On");
	frame.add(panel);
	panel.add(soundbutton);
	panel.add(backbutton);
	frame.setVisible(true);
	frame.setSize(500, 750);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == soundbutton) {
		soundbutton.setText("Music: Off");
		
	}
	if(e.getSource() == soundbutton && hasclickedbutton == true) {
	soundbutton.setText("Music: On");
	
	}
}
}
