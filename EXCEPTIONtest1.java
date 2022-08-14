class EXCEPTIONtest1{
	public static void main(String args[])
	{
		int n1=0,n2=5,s;
		try
		{
			s=n2/n1;
			System.out.println("The result is "+s);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is performed");
		}
	}
}