import java.io.*;
public class reversenumber {
    public static void main(String args[])throws IOException
    {
        int n,s,rev;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number ");
        n=Integer.parseInt(br.readLine());
        rev=0;
        while(n!=0)
        {
            s=n%10;
            n=n/10;
            rev=rev*10;
            rev=rev+s;
        }
      System.out.println("the reverse of the above number is "+rev);
    }
}
