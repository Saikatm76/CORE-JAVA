import java.io.*;
public class countnotesnumber {
    public static void main(String args[])throws IOException
    {
        int n,i,j,h,g,f,m,p,q,r,s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number ");
        n=Integer.parseInt(br.readLine());
        if(n>=2000)
        {
            s=n/2000;
            System.out.println("notes of 2000="+s);
            n=n%2000;
        }
        if(n>=500)
        {
            p=n/500;
            System.out.println("notes of 500="+p);
            n=n%500;
        }
        if(n>=200)
        {
            q=n/200;
             System.out.println("notes of 200="+q);
            n=n%200;
        }
        if(n>=100)
        {
            r=n/100;
            System.out.println("notes of 100="+r); 
            n=n%100;
        }
           if(n>=50)
           {
               m=n/50;
               System.out.println("notes of 50="+m);
               n=n%50;
           }
          if(n>=20) 
          {
              f=n/20;
              System.out.println("notes of 20="+f);
              n=n%20;
          }
          if(n>=10)
          {
              g=n/10;
               System.out.println("notes of 10="+g);
              n=n%10;
          }
          if(n>=5)
          {
              h=n/5;
               System.out.println("notes of 5="+h);
             n=n%5; 
    }
    if(n>=2)
    {
        i=n/2;
         System.out.println("notes of 2="+i);
        n=n%2;
    }
    if(n==1)
    {
      j=n; 
       System.out.println("notes of 1="+j);  
    }
}
}