import java.io.*;
public class inputstrong {
    public static void main(String args[])throws IOException
    {
        int n,i,sum,mul,temp,re;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        n=Integer.parseInt(br.readLine());
        temp=n;
       sum=0;
        while(temp!=0)
        {
            re=temp%10;
            temp=temp/10;
            mul=1;
            while(re!=0)
            {
                mul=mul*re;
                re--;
            }
            
            sum=sum+mul;
        }
        if(sum==n)
        {
            System.out.println(n+" is a strong number");
        }
        else
        {
            System.out.println(n+" not a strong number");
        }
    }
    
}
