import java.io.*;
class SwapNumberWithout3rdVar{
	public static void main(String[] args)throws IOException {
	int a,b;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 1st number");	
	a=Integer.parseInt(br.readLine());
	System.out.println("Enter 2nd number");	
	b=Integer.parseInt(br.readLine());
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping:"+a+" "+b);
	}
}