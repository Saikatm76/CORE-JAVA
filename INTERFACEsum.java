interface cal{
	static final int a=5;
	static final int b=6;
	public void compute();
	public void show();
}
class method implements cal
{
	int s;
	public void compute()
	{
		s=a+b;
	}
	public void show()
	{
		System.out.println("The sum is "+s);
	}
}
class INTERFACEsum{
public static void main(String[] args) {
	method mb1=new method();
	mb1.compute();
	mb1.show();
}
}