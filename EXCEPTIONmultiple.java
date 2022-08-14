class EXCEPTIONmultiple{
	public static void main(String args[])
	{
		int array[]={2,3};
		int n1=100,n2=0,s,t=0;
		try{
			
			System.out.println(array[3]);
			s=n1/n2;
			System.out.println("the result is"+s);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Araay index out of bound");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0");
		}
		
		catch(Exception e)
		{
			System.out.println("Some other error");
		}
	}
}