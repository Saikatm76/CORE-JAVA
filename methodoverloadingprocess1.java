class method{
	void sum(int a,int b)
	{
		System.out.println("sum="+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("sum="+(a+b+c));
	}

}
class methodoverloadingprocess1{
	public static void main(String[] args) {
		method mb1=new method();
		mb1.sum(3,5);
		mb1.sum(2,5,6);
	}
}