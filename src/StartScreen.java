import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.*;


public class StartScreen extends JPanel implements Runnable, MouseListener  {
JFrame frame;

int frameheight = 1500;
int framewidth = 1250;
BufferedImage startscreenimage;
public static void main(String[] args) throws Exception {
	SwingUtilities.invokeLater((Runnable) new StartScreen());
	
}
StartScreen() throws Exception {
	frame = new JFrame();
	
	startscreenimage = ImageIO.read(getClass().getResource("0003.jpg"));
	frame.addMouseListener(this);
	
	
	
	
	frame.setVisible(true);
	
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
		startscreenimage = ImageIO.read(getClass().getResource(imageName));
	} catch (Exception e) {
		System.err.println("Couldn't find this image: " + imageName);
	}
	repaint();
}

@Override
public void paintComponent(Graphics g) {
	g.drawImage(startscreenimage, 0, 0, null);
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
	
	
	if(mousex > 546 && mousex < 751) {
		if(mousey > 478 && mousey < 553) {
		try {
			Options n = new Options();
			Options.main(null);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		AudioClip music = JApplet.newAudioClip(getClass().getResource("8bit.aiff"));
		music.play();
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
