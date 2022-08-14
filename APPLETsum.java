import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class APPLETsum extends Applet implements ActionListener
{
	
    TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	TextField t3=new TextField(10);
	Label l1=new Label("FIRST NUMBER:");
	Label l2=new Label("SECOND NUMBER:");
	Label l3=new Label("ADDITION:");
	Button b=new Button("ADD");
	public void init()
	{
                setLayout(null);
                l1.setBounds(50,50,130,20);
                t1.setBounds(200,50,100,20);
                l2.setBounds(50,100,130,20);
                t2.setBounds(200,100,100,20);
                b.setBounds(200,150,80,20);
                l3.setBounds(380,75,100,20);
                t3.setBounds(500,75,100,20);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		add(t3);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			t3.setText(" "+(n1+n2));
		}
	}
}