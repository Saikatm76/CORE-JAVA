class method{
	void sum(int a,int b)
	{
	System.out.println("sum="+(a+b));
	}
	void sum(float a,float b)
	{
		System.out.println("sum="+(a+b));
	}
	}
class methodoverloadingprocess2{
		public static void main(String[] args) {
			method mb1=new method();
		    mb1.sum(3,5);
			mb1.sum(1.5f,2.5f);
		}
	}