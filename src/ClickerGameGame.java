import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import sun.applet.Main;

public class ClickerGameGame extends JPanel implements Runnable, MouseListener {
	int framewidth = 1250;
	int frameheight = 1500;
	JFrame frame;
	
	int money = 0;
	BufferedImage GameImage;
public static void main(String[] args) throws Exception {
	SwingUtilities.invokeLater((Runnable) new ClickerGameGame());
}
ClickerGameGame() throws Exception {
	 frame = new JFrame();
	 frame.addMouseListener(this);
	
	 GameImage = ImageIO.read(getClass().getResource(null));
}
private void showAnotherImage(String imageName) {
	try {
		GameImage = ImageIO.read(getClass().getResource(imageName));
	} catch (Exception e) {
		System.err.println("Couldn't find this image: " + imageName);
	}
	repaint();
}

@Override
public void paintComponent(Graphics g) {
	g.drawImage(GameImage, 0, 0, null);
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
		AudioClip moneysound = JApplet.newAudioClip(getClass().getResource("soundmoney.aiff"));
		moneysound.play();
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