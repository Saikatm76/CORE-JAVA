public class prime {
    public static void main(String args[])
    {
        int i,j,c;
     
        for(i=1;i<100;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
                
                    if(c==2)
                    {
                    System.out.println("prime numbers are "+i);
                }
                   
                    
           }
    }
    
}
