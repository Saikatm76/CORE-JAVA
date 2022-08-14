class method
{
	void display()
	{
		int i,j,c;
		c=1;
		for(i=1;i<=5;i++)
		{
        for(j=1;j<=i;j++)
        {
        	System.out.print(c);
        	c++;
        }
        System.out.println();
		}
	}
}
class methodpattern1{
	public static void main(String[] args) {
		method mb1=new method();
		mb1.display();
	}
}