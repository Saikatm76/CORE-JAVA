import java.io.*;
class divisibleornot{
	public static void main(String[] args)throws IOException {
	int n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number");
       n=Integer.parseInt(br.readLine());
       if(n%5==0)
       {
       	if(n%11==0)
       	{
       		System.out.println("The number is divisible by 5 & 11");
       	}
       else
       	{
       		System.out.println("The number is not divisible by 5 & 11");
       	}
	}
else
{
System.out.println("The number is not divisible by 5 & 11");
}
}
}