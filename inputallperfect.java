import java.io.*;
public class inputallperfect { 
    public static void main(String args[])throws IOException
  {
int i,j,sum;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a limit: ");
int n=Integer.parseInt(br.readLine());
System.out.println("The perfect numbers are: ");
       for(i=2;i<=n;i++)
       {
           sum=0;
           for(j=1;j<i;j++)
           {
               if(i%j==0)
             
                   sum=sum+j;
           
           }

           if(sum==i)
{
    System.out.println(i);
}
       }
    }
    
}
