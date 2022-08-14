import java.io.*;
public class checknumber {
    public static void main(String args[])throws IOException
    {
      int n;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the number: ");
      n=Integer.parseInt(br.readLine());
      if(n>0)
      {
        System.out.println("the number is posetive");
      }
      if(n<0)
      {
          System.out.println("the number is negetive");
      }
      if(n==0)
      {
          System.out.println("the number is 0");
      }
    }
    
}
