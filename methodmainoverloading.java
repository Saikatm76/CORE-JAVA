class methodmainoverloading{
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	 {
		System.out.println("main method overloaded");
		main(5);
	}
}