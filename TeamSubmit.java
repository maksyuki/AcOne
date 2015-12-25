import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class TeamSubmit extends JFrame {
	private JPanel toppanel = new JPanel();
	private String[] name = new String[] {"Submit Run", "View Runs", "Request Clarification", "View Clarifications", "Options"};
	private String[] problemname = new String[] {"A", "B", "C", "D", "E", "F"};
	private String[] languagename = new String[] {"GNU C++", "Java"};
	private JPanel tabpanel0 = new JPanel();
	private JPanel tabpanel1 = new JPanel();
	private JPanel tabpanel2 = new JPanel();
	private JPanel tabpanel3 = new JPanel();
	private JPanel tabpanel4 = new JPanel();
	private JPanel tabpanel0bottompanel = new JPanel();
	private JPanel tabpanel0centerpanel = new JPanel();
	private JPanel tabpanel0filepanel = new JPanel();
	private JPanel tabpanel0panel = new JPanel();
	private JPanel tabpanel0panelsouth = new JPanel();
	private JPanel tabpanel0panelwest = new JPanel();
	private JPanel tabpanel0paneleast = new JPanel();
	private JComboBox<String> problemselect = new JComboBox<>(problemname);
	private JComboBox<String> languageselect = new JComboBox<>(languagename);
	private JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
	private JButton topbutton = new JButton("Exit");
	private JButton centerbutton = new JButton("Select");
	private JButton bottombutton1 = new JButton("Test");
	private JButton bottombutton2 = new JButton("Sumbit");
	private JButton filebutton1 = new JButton("Add");
	private JButton filebutton2 = new JButton("Remove");
	private JLabel time = new JLabel("STOPPED CONTEST IS NOT RUNNING");
	private JLabel submitfile = new JLabel("D:\\Documents\\Program\\abcd\\acm\\test.cpp");
	
	public TeamSubmit(String name) {
		this.setTitle(name);
	}

	public void Init() {
		//------TOP------//
		//toppanel.setLayout(new GridLayout(1, 2, 140, 140));
		toppanel.setLayout(new BorderLayout());
		toppanel.add(time, BorderLayout.WEST);
		toppanel.add(topbutton, BorderLayout.EAST);
		this.add(toppanel, BorderLayout.NORTH);
		//------CENTER------//
		//---TABLE_ZERO---//
		tabpanel0bottompanel.setLayout(new GridLayout(1, 2, 366, 366));
		tabpanel0bottompanel.add(bottombutton1);
		tabpanel0bottompanel.add(bottombutton2);
		//tabpanel0bottompanel.setLayout(new BorderLayout());
		//tabpanel0bottompanel.add(bottombutton1, BorderLayout.WEST);
		//tabpanel0bottompanel.add(bottombutton2, BorderLayout.EAST);

		//--PROBLEM--// 
		JPanel tt1 = new JPanel(); 
		tt1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Problem"));
		tt1.setLayout(new BorderLayout());
		tt1.add(problemselect);	

		//--LANGUAGE--//
		JPanel tt2 = new JPanel();
		tt2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Language"));
		tt2.setLayout(new BorderLayout());
		tt2.add(languageselect);

		//--MAIN FILE--//
		JPanel tt3 = new JPanel();
		tt3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Main File"));
		tt3.setLayout(new BorderLayout());
		//tabpanel0centerpanel.setLayout(new GridLayout(1, 2));
		tabpanel0centerpanel.setLayout(new BorderLayout());
		tabpanel0centerpanel.add(submitfile, BorderLayout.WEST);
		tabpanel0centerpanel.add(centerbutton, BorderLayout.EAST);
		tt3.add(tabpanel0centerpanel);

		//--ADDITIONAL FILES--//	
		JPanel tt4 = new JPanel();
		tt4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Additional Files")); 
		tt4.setLayout(new BorderLayout());
		tabpanel0filepanel.setLayout(new GridLayout(1, 2, 336, 336));
		tabpanel0filepanel.add(filebutton1);
		tabpanel0filepanel.add(filebutton2);
		//tabpanel0filepanel.setPreferredSize(new Dimension(36, 36));
		tt4.add(tabpanel0filepanel, BorderLayout.CENTER);	
		//tt4.setPreferredSize(new Dimension(36, 36));
		
		tabpanel0panel.setLayout(new GridLayout(5, 1));
		tabpanel0panel.add(tt1);
		tabpanel0panel.add(tt2);
		tabpanel0panel.add(tt3);
		tabpanel0panel.add(tt4);
		tabpanel0panel.add(tabpanel0bottompanel);
		tabpanel0.setLayout(new BorderLayout(35, 16));
		tabpanel0.add(tabpanel0panel, BorderLayout.CENTER);
		tabpanel0.add(tabpanel0panelsouth, BorderLayout.SOUTH);
		tabpanel0.add(tabpanel0panelwest, BorderLayout.WEST);
		tabpanel0panelwest.setPreferredSize(new Dimension(0, 0));
		tabpanel0paneleast.setPreferredSize(new Dimension(36, 36));
		tabpanel0.add(tabpanel0paneleast, BorderLayout.EAST);
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
