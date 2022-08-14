import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class APPLETlargestnumber extends Applet implements ActionListener
{
	 TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	TextField t3=new TextField(10);
	TextField t4=new TextField(10);
	Label l1=new Label("FIRST NUMBER:");
	Label l2=new Label("SECOND NUMBER:");
	Label l3=new Label("THIRD NUMBER:");
	Label l4=new Label("LARGEST NUMBER is");
	Button b=new Button("CLICK");
	public void init()
	{
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			int n3=Integer.parseInt(t3.getText());
			if(n1>n2 && n1>n3)
			{
				t4.setText(""+n1);
			}
			else if(n2>n3)
			{
				t4.setText(""+n2);
			}
			else
			{
				t4.setText(""+n3);
			}
		}
	}
}
		
		