import java.io.*;
public class inputfactors {
    public static void main(String args[])throws IOException
    {
       int n,i;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the number ");
       n=Integer.parseInt(br.readLine());
       System.out.println("all the factors of above number");
       for(i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               System.out.println(i);
           }
       }
    }
    
}
