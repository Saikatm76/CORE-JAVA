import java.io.*;
class checkevenodd{
	public static void main(String args[])throws IOException
	{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		n=Integer.parseInt(br.readLine());
		if(n%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}
}