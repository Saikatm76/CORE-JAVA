import java.io.*;
public class fibonacciseries {
    public static void main(String args[])throws IOException
    {
        int n,i,a,b,str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the range");
       n=Integer.parseInt(br.readLine());
       a=0;
       b=1;
        System.out.println("Fibonacci Series: ");
       for(i=0;i<n;i++)
       {
           if(i<=1)
           {
               System.out.println(i);
           }
           else
           {
               str=a+b;
               System.out.println(str);
               a=b;
               b=str;   
           }
       }
    }  
}
