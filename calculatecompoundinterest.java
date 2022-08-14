import java.io.*;
public class calculatecompoundinterest {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the principle: ");
        int p=Integer.parseInt(br.readLine());
         System.out.println("Enter the time: ");
        double t= Double.parseDouble(br.readLine());       
         System.out.println("Enter the rate of interest: ");
        double r=Double.parseDouble(br.readLine());
        double s=(1+(r/100));
       double mul=1;
        for(int i=1;i<=t;i++)
        {
           mul=mul*s;
        }
        double ci=p*mul;
        System.out.println("compound interest: "+ci);
    }
    
}
