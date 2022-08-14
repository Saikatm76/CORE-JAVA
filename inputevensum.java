import java.io.*;
public class inputevensum {
    public static void main(String args[])throws IOException
    {
        int i,sum,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the range ");
        n=Integer.parseInt(br.readLine());
        sum=0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("the sum of even numbers is "+sum);
    }
    
}
