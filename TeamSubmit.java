import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class TeamSubmit extends JFrame {
	private JPanel toppanel = new JPanel();
	private JPanel tabpanel0 = new JPanel();
	private JPanel tabpanel1 = new JPanel();
	private JPanel tabpanel2 = new JPanel();
	private JPanel tabpanel3 = new JPanel();
	private JPanel tabpanel4 = new JPanel();
	private JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
	private JButton topbutton = new JButton("Exit");
	private JButton bottombutton1 = new JButton("Test");
	private JButton bottombutton2 = new JButton("Sumbit");
	private JLabel time = new JLabel("STOPPED");
	private String[] name = new String[] {"Submit Run", "View Runs", "Request Clarification", "View Clarifications", "Options"};

	public TeamSubmit(String name) {
		this.setTitle(name);
	}

	public void Init() {
		//------TOP------//
		toppanel.add(time);
		toppanel.add(topbutton);
		this.add(toppanel, BorderLayout.NORTH);
		//------CENTER------//
		//---TABLE_ZERO---//
		tabpanel0.add(bottombutton2);
		//tabpanel[0].add(bottombutton2);
		//---TABLE_ONE---//
		//---TABLE_TWO---//
		//---TABLE_THREE-//
		//---TABLE_FOUR--//
		tab.addTab(name[0], null, tabpanel0, null);
		tab.addTab(name[1], null, tabpanel1, null);
		tab.addTab(name[2], null, tabpanel2, null);
		tab.addTab(name[3], null, tabpanel3, null);
		tab.addTab(name[4], null, tabpanel4, null);

		this.add(tab, BorderLayout.CENTER);
		//------AddEventListener------//
		bottombutton2.addActionListener(new clickSubmitListener());
		//------ALLSET------//
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(120, 120, 626, 431);
		this.setVisible(true);
	}

	class clickSubmitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TeamSubmit tt = new TeamSubmit("supermaker");//This is a mistake to modify
			int cmd = JOptionPane.showConfirmDialog(tt, "Are you want to submit?", "Confirm Submission", JOptionPane.YES_NO_CANCEL_OPTION,
					                                JOptionPane.QUESTION_MESSAGE);
			if (cmd == 0) {
				System.out.println ("I am supermaker");
			}
		}
	}
}
