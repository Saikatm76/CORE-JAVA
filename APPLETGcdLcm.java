import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class APPLETGcdLcm extends Applet implements ActionListener
{
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	Label l1=new Label("1st number");
	Label l2=new Label("2nd number");
	TextField t3=new TextField(10);
	TextField t4=new TextField(10);
	Label l3=new Label("GCD");
	Label l4=new Label("LCM");
	Button b=new Button("click");
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
			
			int temp1=n1;
			int temp2=n2;
			while(n1!=n2)
			{
				if(n1>n2)
				{
					n1=n1-n2;
				}
				else
				{
					n2=n2-n1;
				}
			}
			int n3=n1;
			int q=temp1*temp2;
			int n4=q/n1;
			t3.setText(" "+n3);
			t4.setText(" "+n4);
		}
	}
}