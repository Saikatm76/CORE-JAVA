import java.io.*;
class trianglefindangle{
	public static void main(String[] args)throws IOException {
	int a1,a2,a3;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 1st & 2nd angle of the triangle");
	a1=Integer.parseInt(br.readLine());
	a2=Integer.parseInt(br.readLine());
	int sum=(a1+a2);
	if(sum<180)
	{
		int rem=180-sum;
		System.out.println("The third angle of this Triangle is: "+rem);
	}
	else
	{
		System.out.println("You have entered two angle must be less than 180");
	}
	}
}