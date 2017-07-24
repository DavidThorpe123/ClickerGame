import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Options extends JPanel implements Runnable, MouseListener  {
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
	frame.addMouseListener(this);
	
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
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	int mousex = e.getX();
	int mousey = e.getY();
	System.out.println("X" + mousex);
	System.out.println("Y" + mousey);
 AudioClip effect = JApplet.newAudioClip(getClass().getResource("clicksoundeffect.aiff"));
	effect.play();
	if(mousex > 38 && mousex < 167) {
		if(mousey > 657 && mousey < 730) {
			frame.dispose();
			try {
				StartScreen ss = new StartScreen();
				StartScreen.main(null);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
