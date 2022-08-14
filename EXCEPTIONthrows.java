class EXCEPTIONthrows
{
	static void demo()throws ArithmeticException
	{
      int n1=5,n2=0,s;
      s=n1/n2;
	}
	public static void main(String[] args) {
		try
		{
demo();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}