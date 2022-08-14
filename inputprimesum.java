import java.io.*;
class inputprimesum{
	public static void main(String[] args)throws IOException {
	int n,sum;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a given range");
	n=Integer.parseInt(br.readLine());
	System.out.println("Prime Numbers:");
	for(int i=1;i<=n;i++)
	{
		int c=0;
		for(int j=1;j<=i;j++)
		{
          if(i%j==0)
          {
          	c++;
          }
		}
		if(c==2)
	{
		System.out.println(i);
	}
	}
	sum=0;
	for(int k=1;k<=n;k++)
	{
		int b=0;
		for(int m=1;m<=k;m++)
		{
          if(k%m==0)
          {
          	b++;
          }
		}
		if(b==2)
	{
		sum=sum+k;
	}
	}
	System.out.println("Sum of this prime numbers is:"+sum);
	}
}