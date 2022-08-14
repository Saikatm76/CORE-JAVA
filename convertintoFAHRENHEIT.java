import java.io.*;
public class convertintoFAHRENHEIT{
 public static void main(String args[])throws IOException
 {
     double cel;
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the temperature in celsius: ");
 cel=Double.parseDouble(br.readLine());
 double s=(cel*1.8);
 double far=s+32;
  System.out.println("The temperature in fahrenheit is: "+far);
 }
}
