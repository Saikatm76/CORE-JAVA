import java.io.*;
class arraylargestnumber{
	public static void main(String[] args)throws IOException {
		int ar[]=new int[3];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number");
		ar[0]=Integer.parseInt(br.readLine());
		System.out.println("Enter the second number");
		ar[1]=Integer.parseInt(br.readLine());
		System.out.println("Enter the third number");
		ar[2]=Integer.parseInt(br.readLine());
		if(ar[0]>ar[1] && ar[0]>ar[2])
		{
			System.out.println(ar[0]+" is max");
		}
		else if(ar[1]>ar[2])
		{
			System.out.println(ar[1]+" is max");
		}
		else System.out.println(ar[2]+" is max");
	}
}