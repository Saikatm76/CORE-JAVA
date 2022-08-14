import java.io.*;
public class inputcheckprimenumber {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number: ");
        int n=Integer.parseInt(br.readLine());
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
         System.out.println(n+" is a prime number");  
        }
        else
        {
            System.out.println(n+" is not prime");
        }
    }
    
}
