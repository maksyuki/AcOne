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
	private int gx0;
	private int gy0;
	private int glength;
	private int gwidth;

	public JDrawPanel(File f, int length, int width, int gx0, int gy0, int glength, int gwidth) throws Exception { 
		this.setSize(length, width);
		this.gx0 = gx0;
		this.gy0 = gy0;
		this.glength = glength;
		this.gwidth = gwidth;
		bgImage = ImageIO.read(f);
		this.setVisible (true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(bgImage, gx0, gy0, glength, gwidth, this);
	}
}


