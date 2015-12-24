import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class Main {
	private JFrame f = new JFrame("AcOne Login");
	private JPanel toppanel = new JPanel();
	private JPanel leftpanel = new JPanel();
	private JPanel bottompanel = new JPanel();
	private JPanel centerpanel = new JPanel();
	private JLabel toplabel = new JLabel("California State University, Sacramento");
	private JTextField centertext1 = new JTextField(30);
	private JTextField centertext2 = new JTextField(30);
	private JButton centerbutton1 = new JButton("Login");
	private JButton centerbutton2 = new JButton("Exit");
	
	public void Init() {
		toppanel.add(toplabel);
		centerpanel.add(centertext1);
		centerpanel.add(centertext2);
		centerpanel.add(centerbutton1);
		centerpanel.add(centerbutton2);
		f.add(toppanel, BorderLayout.NORTH);
		f.add(centerpanel, BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(30, 30, 626, 431);
		f.setVisible(true);
	}	
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		new Main().Init();
	}
}
