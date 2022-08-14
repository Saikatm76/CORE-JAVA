import java.io.*;
public class inputnumberprimefactor {
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number: ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("FACTOR: ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(+i);
            }
        }
         System.out.println("PRIME: ");
    
        for(int j=1;j<=n;j++)
        {
            if(n%j==0)
            {
                int c=0;
                for(int k=1;k<=j;k++)
                {
                  if(j%k==0) 
                  {
                      c++;
                  }
                  
                }
               if(c==2)
                  {
                      System.out.println(j);
                  } 
            }
            
        }
    }
    
}
