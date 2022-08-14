import java.io.*;
public class inputallamstrong {
    public static void main(String args[])throws IOException
    {
        int n,temp,sum,i,s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the range ");
        n=Integer.parseInt(br.readLine());
System.out.println("amstrong numbers are");
        for(i=1;i<=n;i++)
        {
            temp=i;
            sum=0;
            while(temp!=0)
            {
                s=temp%10;
                temp=temp/10;
                sum=sum+(s*s*s);
            }
        
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
    
}
