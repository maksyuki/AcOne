import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class Main {
	private JFrame f = new JFrame("AcOne Login");
	private JPanel toppanel = new JPanel();
	private JPanel rightpanel = new JPanel();
	private JPanel centerpanel1 = new JPanel();
	private JPanel centerpanel2 = new JPanel();
	private JLabel toplabel1 = new JLabel("California State University, Sacramento", JLabel.CENTER);
	private JLabel toplabel2 = new JLabel("Programming Contest Control System", JLabel.CENTER);
	private JLabel name = new JLabel("Name");
	private JLabel password = new JLabel("Password");
	private JLabel hint = new JLabel("Unable to contact server, contact staff", JLabel.RIGHT);
	private JTextField centertext1 = new JTextField(30);
	private JPasswordField centertext2 = new JPasswordField(30);
	private JButton centerbutton1 = new JButton("Login");
	private JButton centerbutton2 = new JButton("Exit");
	
	public void Init() {
		//------TOP------//
		toplabel1.setFont(new java.awt.Font(Font.DIALOG, Font.BOLD, 22));
		toplabel2.setFont(new java.awt.Font(Font.DIALOG, Font.BOLD, 24));
		toppanel.setLayout(new GridLayout(2, 1));
		toppanel.add(toplabel1);
		toppanel.add(toplabel2);
		//------CENTER------//
		centerpanel1.setLayout(new GridLayout(6, 1, 1, 1));
		centerpanel1.add(name);
		centerpanel1.add(centertext1);
		centerpanel1.add(password);
		centerpanel1.add(centertext2);
		centerpanel2.setLayout(new GridLayout(1, 2, 166, 166));
		centerpanel2.add(centerbutton1);
		centerpanel2.add(centerbutton2);
		centerpanel1.add(centerpanel2);
		hint.setFont(new java.awt.Font(Font.DIALOG, Font.BOLD, 14));
		centerpanel1.add(hint);
		//------BOTTOM------//
		//bottompanel.setPreferredSize(new Dimension(66, 80));
		//------LEFT------//
		
		//------ALLSET------//
		f.setLayout(new BorderLayout(36, 30));
		f.add(toppanel, BorderLayout.NORTH);
		f.add(centerpanel1, BorderLayout.CENTER);
		f.add(rightpanel, BorderLayout.EAST);
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
		
		try {
			Main tt = new Main();
			JDrawPanel bottomdraw = new JDrawPanel(new File("image/icpc_banner.png"));
			JDrawPanel leftdraw = new JDrawPanel(new File("image/sac_state.png"));
			tt.Init();
			bottomdraw.setPreferredSize(new Dimension(66, 78));
			leftdraw.setPreferredSize(new Dimension(130, 78));
			tt.f.add(bottomdraw, BorderLayout.SOUTH);
			tt.f.add(leftdraw, BorderLayout.WEST);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
