import java.io.*;
public class inputallstrongnumber {
    public static void main(String args[])throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the range: ");
int n=Integer.parseInt(br.readLine());
  System.out.println("Strong numbers are: ");
for(int i=1;i<=n;i++)
{
    int temp=i;
   int  sum=0;
    while(temp!=0)
    { 
        int mul=1;
        int s=temp%10;
        temp=temp/10;
        while(s!=0)
        {
            mul=mul*s;
            s--;
        }
        sum=sum+mul;
    }
    if(sum==i)
    {
        System.out.println(sum);
    }
    
}
    }
    
}
