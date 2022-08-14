class palindrome {
    public static void main(String args[])
    {
        int i,a,b,c,a1,mul,j,p,q,r,s,t,u,sum;
        System.out.println("Palindrome no are:");
        for(i=100;i<=999;i++)
        {
         a=i/100;
         a1=i%100;
         b=a1/10;
         c=a1%10;
         mul=c*100+b*10+a;
         if(i==mul)
         System.out.println(i);
        }
        for(j=1000;j<=9999;j++)
        {
         p=j/1000;
         q=j%1000;
         r=q/100;
         s=q%100;
         t=s/10;
         u=s%10;
         sum=u*1000+t*100+r*10+p;
         if(j==sum)
             System.out.println(j);
        }
        }
        
    }
    

