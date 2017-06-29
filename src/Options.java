import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Options extends JPanel implements Runnable  {
	JFrame frame;
	JPanel panel;
	BufferedImage optionimage;
	boolean hasclickedbutton = false;
	int framewidth = 1250;
	int frameheight = 1500;
public static void main(String[] args) throws Exception {
	SwingUtilities.invokeLater((Runnable) new Options());
}
Options() throws Exception  {
	frame = new JFrame();
	
	
	optionimage = ImageIO.read(getClass().getResource("optionlit.jpg"));
	
	
	
	
	
}
@Override
public void run() {
	// TODO Auto-generated method stub
	frame.add(this);
	setPreferredSize(new Dimension(framewidth, frameheight));
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setVisible(true);
}
private void showAnotherImage(String imageName) {
	try {
		optionimage = ImageIO.read(getClass().getResource(imageName));
	} catch (Exception e) {
		System.err.println("Couldn't find this image: " + imageName);
	}
	repaint();
	
}
@Override
public void paintComponent(Graphics g) {
	g.drawImage(optionimage, 0, 0, null);
}

}
