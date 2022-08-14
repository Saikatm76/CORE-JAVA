import java.io.*;
public class inputperfectselectnumber {
    public static void main(String args[])throws IOException
    {
        int n,j,sum;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the number ");
        n=Integer.parseInt(br.readLine());
        sum=0;
        for(j=1;j<n;j++)
        {
            if(n%j==0)
            {
                sum=sum+j;
            }
        }
        if(sum==n){
        System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" not a perfect number");
        }
    }
    
}
