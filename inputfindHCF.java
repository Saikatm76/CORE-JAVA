import java.io.*;
class inputfindHCF{
	public static void main(String[] args)throws IOException {
	int n1,n2;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two number");
	n1=Integer.parseInt(br.readLine());
	n2=Integer.parseInt(br.readLine());
	while(n1!=n2)
	{
     if(n1>n2)
     {
     	n1=n1-n2;
     }
     else
     {
     	n2=n2-n1;
     }
}
System.out.println("The HCF of above two number is: "+n1);
	}
}