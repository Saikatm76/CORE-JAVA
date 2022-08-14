class EXCEPTIONthrow1
{
	static void demo()
	{
	try
	{
		throw new ArithmeticException("problem found");
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
public static void main(String[] args) {
	demo();
}
}