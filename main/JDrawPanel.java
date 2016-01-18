import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;
import javax.imageio.ImageIO;

public class JDrawPanel extends JPanel {
	private BufferedImage bgImage;

	public JDrawPanel(File f) throws Exception { 
		//this.setSize(length, width);
		bgImage = ImageIO.read(f);
		this.setVisible (true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(bgImage, 0, 0, this);
	}
}


