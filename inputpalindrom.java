import java.io.*;
public class inputpalindrom {
 public static void main(String args[]) throws IOException
 {
     int n,s,rev,temp;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter any number ");
     n=Integer.parseInt(br.readLine());
     temp=n;
     rev=0;
     while(temp>0)
     {
         s=temp%10;
         temp=temp/10;
         rev=rev*10;
         rev=rev+s;
     }
     if(rev==n)
     {
         System.out.println("the number is palindrome");
     }
     else
     {
           System.out.println("the number is not palindrome");
     }
 }
}
