public class amstrong {
    public static void main(String args[])
    {
            int i,a,a1,b,c,mul;
            for(i=1;i<=300;i++)
            {
                a=i/100;
                a1=i%100;
                b=a1/10;
                c=a1%10;
                mul=a*a*a+b*b*b+c*c*c;
                if(mul==i)
                {
                 System.out.println("amstrong numbers are "+i);
                }
            }
    
    
    }
}
