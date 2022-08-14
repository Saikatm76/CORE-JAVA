class EXCEPTIONthrow
{
	static void throwdemo()
	{
		try
		{
			throw new IllegalAccessException("my exception");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught"+e);
		}
	}
	public static void main(String[] args) {
		throwdemo();
	}
}