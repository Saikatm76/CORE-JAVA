import java.io.*;
public class sumnumberdigits {
    public static void main(String args[])throws IOException
    {
        int n,sum,s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number ");
        n=Integer.parseInt(br.readLine());
        sum=0;
        while(n!=0)
        {
            s=n%10;
            n=n/10;
            sum=sum+s;
    }
        System.out.println("sum of each digits in number is "+sum);
    }
    
}
