import java.io.*;
public class inputcheckamstrongnumber {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number: ");
        int n=Integer.parseInt(br.readLine());
        int sum=0;
        int temp=n;
        while(temp!=0)
        {
            int s=temp%10;
            temp=temp/10;
            sum=sum+(s*s*s);
        }
        if(sum==n)
        {
            System.out.println(n+" is amstrong number");
        }
        else
        {
           System.out.println(n+" is not amstrong number");
        }
    }
    
}
