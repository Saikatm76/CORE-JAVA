import java.io.*;
class FINDzeros{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a limit");
		int l=Integer.parseInt(br.readLine());
		int c=0;
		for(int i=1;i<=l;i++)
		{
			int n=i;
			while(n!=0)
			{
				int p=n%10;
				n=n/10;
				if(p==0)
				{
					c++;
				}
			}
		}
		System.out.println("Zeroes between 1 to "+l+" is "+c);
	}
}