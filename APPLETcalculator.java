import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class APPLETcalculator extends Applet implements ActionListener
{
	
	TextField t1=new TextField(15);
	TextField t2=new TextField(15);
	TextField t3=new TextField(20);
	Label l1=new Label("  1st ::");
	Label l2=new Label("  2nd ::");
	Button b=new Button(" ADD ");
	Button c=new Button(" SUB ");
	Button d=new Button(" MUL ");
	Button e=new Button(" DIV ");
	Button f=new Button("CLEAR");
	public void init()
	{
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		add(t3);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		f.addActionListener(this);
		setBackground(Color.green);
		l1.setBackground(Color.yellow);
		l2.setBackground(Color.yellow);
		t1.setBackground(Color.pink);
		t2.setBackground(Color.pink);
	}
	public void actionPerformed(ActionEvent s)
	{
		double n1=Double.parseDouble(t1.getText());
		double n2=Double.parseDouble(t2.getText());
		if(s.getSource()==b)
		{
			t3.setText(" "+(n1+n2));
		}
		if(s.getSource()==c)
		{
			t3.setText(" "+(n1-n2));
		}
		if(s.getSource()==d)
		{
			t3.setText(" "+(n1*n2));
		}
		if(s.getSource()==e)
		{
			t3.setText(" "+(n1/n2));
		}
		if(s.getSource()==f)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
	}
}