import java.io.*;
public class powernumber {
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number: ");
        int n=Integer.parseInt(br.readLine());
          System.out.println("enter the power: ");
         int  mul=1;
          int p=Integer.parseInt(br.readLine());
          for(int i=1;i<=p;i++)
          {
            mul=mul*n;  
          }
          System.out.println("OUTPUT: "+mul);
    }
    
}
