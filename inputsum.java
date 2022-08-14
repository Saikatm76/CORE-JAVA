import java.io.*;
public class inputsum {
    public static void main(String args[])throws IOException
    {
    int a,b,s;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter two numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
s=a+b;
System.out.println("sum is "+s);
    }
    
}
