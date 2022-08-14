import java.io.*;
public class arrayswapmiddledigit {
  public static void main(String args[])throws IOException{
    int a[]=new int[100];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("How many digit number you want:");
     int z=Integer.parseInt(br.readLine());
    System.out.println("Enter a number");
     int n=Integer.parseInt(br.readLine());
     for(int i=0;i<z;i++)
     { 
    while(n!=0)
{
    int q=n%10;
    n=n/10;
a[i]=q;
break;
}
     }
    int g=a[z-1];
    a[z-1]=a[0];
    a[0]=g;

     for(int j=0;j<z;j++)
     {
        int p=a[j];
        System.out.println(p);
     }

}  
}
