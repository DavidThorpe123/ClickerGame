import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Credits extends JPanel implements Runnable, MouseListener {
	JFrame frame;
	int framewidth = 1250;
	int frameheight = 1500;
	BufferedImage creditsimage;
	
public static void main(String[] args) throws Exception {
	SwingUtilities.invokeLater((Runnable) new Credits());
}
Credits() throws Exception {
	frame = new JFrame();
	frame.addMouseListener(this);
	creditsimage = ImageIO.read(getClass().getResource("0001.jpg"));
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
		creditsimage = ImageIO.read(getClass().getResource(imageName));
	} catch (Exception e) {
		System.err.println("Couldn't find this image: " + imageName);
	}
	repaint();
	
}
@Override
public void paintComponent(Graphics g) {
	g.drawImage(creditsimage, 0, 0, null);
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
	if(mousex > 34 && mousex < 138) {
		if(mousey > 661 && mousey < 727) {
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

