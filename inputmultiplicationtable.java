import java.io.*;
public class inputmultiplicationtable {
    public static void main(String args[])throws IOException
    {
        int n,r,mul,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number ");
        n=Integer.parseInt(br.readLine());
        System.out.println("enter the range ");
        r=Integer.parseInt(br.readLine());
       System.out.println("MULTIPLICATION TABLE");
        for(i=1;i<=r;i++)
        {
          mul=n*i;
          System.out.println(n+"*"+i+"="+mul);
        }
    }
    
}
