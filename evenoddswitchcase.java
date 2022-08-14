import java.io.*;
class evenoddswitchcase{
	public static void main(String[] args)throws IOException {
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number: ");
		n=Integer.parseInt(br.readLine());
		switch(n%2)
		{
			case 0:
			System.out.println("the number is even");
			break;
			case 1:
			System.out.println("the number is odd");
             break;
		}
	}
}