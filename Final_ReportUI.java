import javax.swing.*;

class Final_ReportUI
{
	JTextField t1,t2,t3,t4,t5,t6;
	JLabel l1,l2,l3,l4,l5,l6;
	JPanel p;
	
	public Final_ReportUI()
	{
		createComponents();
		addComponents();
	}
	
	void createComponents()
	{
		t1 = new JTextField();
		t1.setBounds(250,20,200,30);
		
		t2 = new JTextField();
		t2.setBounds(250,80,200,30);
		
		t3 = new JTextField();
		t3.setBounds(250,140,200,30);
		
		t4 = new JTextField();
		t4.setBounds(250,200,200,30);
		
		t5 = new JTextField();
		t5.setBounds(250,260,200,30);
		
		
	
		
		l1 = new JLabel("User Name :  ");
		l1.setBounds(100,20,100,30);
		
		l2 = new JLabel("User Id :  ");
		l2.setBounds(100,80,100,30);
		
		l3 = new JLabel("User Height :  ");
		l3.setBounds(100,140,100,30);
		
		l4 = new JLabel("User Weight :  ");
		l4.setBounds(100,200,100,30);
		
		l5 = new JLabel("Message :  ");
		l5.setBounds(100,260,100,30);
		
		p = new JPanel(null);
		p.setBounds(0,0,600,400);
	}
	
	void addComponents()
	{
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t3);
		p.add(l4);
		p.add(t4);
		p.add(l5);
		p.add(t5);
		
		
		
		
	}
}