import java.io.*;
public class arrayswap1stlastdigit {
  public static void main(String args[])throws IOException{
    int a[]=new int[100];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("How many digit number you want:");
	int p=Integer.parseInt(br.readLine());
    System.out.println("Enter a number");
     int n=Integer.parseInt(br.readLine());

     for(int i=p-1;i>=0;i--)
     { 
    while(n!=0)
{
    int q=n%10;
    n=n/10;
a[i]=q;
break;
}
     }
    int g=a[p-1];
    a[p-1]=a[0];
    a[0]=g;

     for(int j=0;j<p;j++)
     {
        int z=a[j];
        System.out.println(z);
     }

}  
}
