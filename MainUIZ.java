import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainUIZ extends JFrame implements ActionListener
{
	UserUI ob1;
	BmiUI	ob2;
	AdminUI ob3;
	Final_ReportUI ob4;
	
	JButton submit,modify,delete,m1,m2,m3,m4;
	JPanel p1,p2,p3,p4,pb;
	JMenuBar mb;
	
	public MainUIZ()
	{
		setSize(600,550);
		setLayout(null);
		setVisible(true);
		setTitle("Body Mass Index");
		
		ob1 = new UserUI();
		ob2 = new BmiUI();
		ob3 = new AdminUI();
		ob4 = new Final_ReportUI();
		
		createPanels();
		createMenu();	
		createButtons();
		addComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void createPanels()
	{
		p1 = ob1.p;
		p2 = ob2.p;
		p3 = ob3.p;
		p4 = ob4.p;
		
		
		pb = new JPanel(new FlowLayout(FlowLayout.CENTER,50,0));
		pb.setBounds(0,400,600,150);
	}
	
	void createMenu()
	{
		mb = new JMenuBar();
		
		m1 = new JButton("User");
		m1.setFocusable(false);
		
		m2 = new JButton("Bmi");
		m2.setFocusable(false);
		
		
		m3 = new JButton("Admin");
		m3.setFocusable(false);
		
		m4 = new JButton("Final_Report");
		m4.setFocusable(false);
		
		
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		remove(p1);
		remove(p2);
		remove(p3);
		remove(p4);
		
		if(e.getSource()==m1)
			add(p1);
		
		else if(e.getSource()==m2)
			add(p2);
			
		else if(e.getSource()==m3)
			add(p3);
		else
			add(p4);
	}
	
	void createButtons()
	{
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Inserted!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		
		modify = new JButton("Modify");
		modify.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Modified!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		
		delete = new JButton("Delete");
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Deleted!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		pb.add(submit);
		pb.add(modify);
		pb.add(delete);
	}
	
	void addComponents()
	{
		add(p1);
		add(pb);
		setJMenuBar(mb);
	}
	
	public static void main(String a[])
	{
		new MainUIZ();
	}
}