import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class APPLETfactorial extends Applet implements ActionListener
{
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	Label l1=new Label("Enter a number");
	Label l2=new Label("FACTORIAL");
	Button b=new Button("CLICK");
	public void init()
	{
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			int n1=Integer.parseInt(t1.getText());
			int p=1;
			while(n1>0)
			{
			   p=n1*p;
				n1--;
			}
			t2.setText(" "+p);
		}
	}
}