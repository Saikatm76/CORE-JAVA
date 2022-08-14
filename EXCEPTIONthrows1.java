class EXCEPTIONthrows1
{
	static void demo()throws ClassNotFoundException
	{

		System.out.println("in method");
		throw new ClassNotFoundException();
	}
public static void main(String[] args) {
	try
	{
		demo();
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("problem found : "+e);
	}
}
}