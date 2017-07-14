import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Upgrades implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton upgrade1;
	JButton upgrade2;
	JButton back;
	boolean hasgottenfirstupgrade = false;
	boolean hasgotten1firstupgrade = false;
	int money = 0;
public static void main(String[] args) {
	Upgrades u = new Upgrades();
}
Upgrades()  {
	frame = new JFrame();
	panel = new JPanel();
	upgrade1 = new JButton();
	upgrade2 = new JButton();
	back = new JButton();
	
	Color r = new Color(123, 129, 140);

	frame.add(panel);
	panel.add(upgrade1);
	panel.add(upgrade2);
	panel.add(back);
	
	
	Dimension buttondimension = new Dimension(1000, 100);
	upgrade1.setPreferredSize(buttondimension);
	upgrade1.setText("Upgrade Money Per Second: 0");
	upgrade1.setFont(new Font("Arial", Font.BOLD, 50 ));
	upgrade1.addActionListener(this);
	back.setPreferredSize(buttondimension);
	back.setText("Back");
	back.setFont(new Font("Arial", Font.BOLD, 50));
	back.addActionListener(this);
	upgrade2.setPreferredSize(buttondimension);
	upgrade2.setText("Upgrade AutoClickers: 0");
	upgrade2.setFont(new Font("Arial", Font.BOLD, 50));
	upgrade2.addActionListener(this);

	panel.setBackground(r);
	
	frame.setSize(1250, 1500);
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == back) {
		try {
			ClickerGameGame gg = new ClickerGameGame();
			ClickerGameGame.main(null);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
	}
	if(e.getSource() == upgrade1 && money > 10) {
		money-= 10;
		upgrade1.setText("Upgrade Money Per Second: 1");
		hasgottenfirstupgrade = true;
	}
	else if(e.getSource() == upgrade1 && money < 100) {
		JOptionPane.showMessageDialog(null, "You need more money!");
	}
	if(e.getSource() == upgrade2 && money > 50) {
		money -= 50;
		upgrade2.setText("Upgrade Autoclickers: 1");
		hasgotten1firstupgrade = true;
	}
	else if(e.getSource() == upgrade2 && money < 50) {
		JOptionPane.showMessageDialog(null, "You need more money!");
	}
	
			
}
}
