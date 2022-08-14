import java.io.*;
public class convertintoMETER {
    public static void main(String args[])throws IOException
    {
 double sm;
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the length in centimeter:");
 sm=Double.parseDouble(br.readLine());
       double m=sm/100;
       double km=sm/100000;
       System.out.println("The length in meter is: "+m);
       System.out.println("The length in kilometer is: "+km);
}
}