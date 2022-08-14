package bankdet;
public class custinfo{
	int a,b;
	String c;
public custinfo(int p,int q,String s)
{
	a=p;
	b=q;
	c=s;
}
public void display()
{
	System.out.println("cust name:"+c);
	System.out.println("account number:"+a);
	System.out.println("cust id:"+b);
}
}