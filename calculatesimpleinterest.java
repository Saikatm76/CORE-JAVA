import java.io.*;
public class calculatesimpleinterest {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the principle: ");
        int p=Integer.parseInt(br.readLine());
         System.out.println("Enter the time: ");
        double t= Double.parseDouble(br.readLine());       
         System.out.println("Enter the rate of interest: ");
        double r=Double.parseDouble(br.readLine());
        
        double s=p*t*r;
        double si=s/100;
      System.out.println("Simple Interest: "+si);
    }
    
}
