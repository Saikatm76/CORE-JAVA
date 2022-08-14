import java.io.*;
public class countdigitnumber {
    public static void main(String args[])throws IOException
    {
      int n,count;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the number ");
      n=Integer.parseInt(br.readLine());
      count=0;
      while(n!=0)
      {
         n=n/10;
        count++;
        }
      System.out.println("the number of digit in the above number = "+count);
    }
    
}
