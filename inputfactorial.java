import java.io.*;
public class inputfactorial {
    public static void main(String args[])throws IOException
    {
        int n,mul;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the number ");
         n=Integer.parseInt(br.readLine());
         mul=1;
         while(n>0)
         {
         mul=mul*n;
         n--;
         }
         System.out.println("factorial of above number="+mul);
    }
    
}
