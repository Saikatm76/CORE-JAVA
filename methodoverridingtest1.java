class method{
	void run()
	{
      System.out.println("stop");
	}
}
class methodoverridingtest1 extends method{
	void run()
	{
		System.out.println("bike is running");
	}
	public static void main(String[] args) {
	methodoverridingtest1 mb1=new methodoverridingtest1();
	mb1.run();	
	}
}