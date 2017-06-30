import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
public class Upgrades {
	JFrame frame;
	JPanel panel;
	JButton upgrade1;
	JButton upgrade2;
public static void main(String[] args) {
	Upgrades u = new Upgrades();
}
Upgrades() {
	frame = new JFrame();
	panel = new JPanel();
	upgrade1 = new JButton();
	upgrade2 = new JButton();
	
	Color r = new Color(123, 129, 140);

	frame.add(panel);
	panel.add(upgrade1);
	panel.add(upgrade2);
	
	
	Dimension buttondimension = new Dimension(1000, 100);
	upgrade1.setPreferredSize(buttondimension);
	upgrade1.setText("Upgrade Money Per Second: 0");
	upgrade1.setFont(new Font("Arial", Font.BOLD, 50 ));
	upgrade2.setPreferredSize(buttondimension);
	upgrade2.setText("Upgrade AutoClickers: 0");
	upgrade2.setFont(new Font("Arial", Font.BOLD, 50));

	panel.setBackground(r);
	
	frame.setSize(1250, 1500);
	frame.setVisible(true);
}
}
