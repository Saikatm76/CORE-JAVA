import java.io.*;
class sumfirstlastdigit{
	public static void main(String[] args)throws IOException {
		int n,p,str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		n=Integer.parseInt(br.readLine());
		int s=n%10;
	int sum=0;
		while(n!=0)
		{
			sum=0;
			p=n%10;
			n=n/10;
            sum=sum+p;
		}
		str=sum+s;
		
		System.out.println("The sum of first & last digit of this number: "+str);
	}
}