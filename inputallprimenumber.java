import java.io.*;
public class inputallprimenumber {
    public static void main(String args[])throws IOException
    {
        int n,i,j,c;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the range");
        n=Integer.parseInt(br.readLine());
        System.out.println("prime numbers are: ");
        for(i=2;i<=n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(i);
            }
        }
    }
    
}
