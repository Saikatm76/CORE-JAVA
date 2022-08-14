import java.io.*;
class NewClass{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of x");
		int x=Integer.parseInt(br.readLine());
		System.out.println("Enter the limit");
		int n=Integer.parseInt(br.readLine());
		int mul=1;
		int sum=0;
		for(int i=2;i<=n-1;i+2)
		{
			mul=mul*x*x;
			for(int j=3;j<=n;j+2)
				int q=1;
			{
              while(j!=0)
              {
              	q=j*q;
              	j--;
              }
              
			}
			sum=sum+(mul/q);
		}
		System.out.println(sum);
	}
}