import java.io.*;
public class digitsfrequencyinnumber {
    public static void main(String args[])throws IOException
    {
        int a,b,c,d,e,f,g,h,i,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number: ");
        long n=Long.parseLong(br.readLine());
        a=b=c=d=e=f=g=h=i=j=0;
        while(n!=0)
        {
            long s=n%10;
            n=n/10;
            if(s==0)
            {
                a++;
            }
                if(s==1)
                {
                    b++;
                }
                if(s==2)
                {
                    c++;
                }
                if(s==3)
                {
                    d++;
                }
                if(s==4)
                {
                    e++;
                }
                if(s==5)
                {
                    f++;
                }
                if(s==6)
                {
                    g++;
                }
                if(s==7)
                {
                    h++;
                    
                }
                if(s==8)
                {
                    i++;
                }
                if(s==9)
                {
                    j++;
                }
            }
                
        
        if(a!=0)
        {
            System.out.println("number 0f 0: "+a);
        }
        if(b!=0)
        {
            System.out.println("number 0f 1: "+b);
        }
        if(c!=0)
        {
            System.out.println("number 0f 2: "+c);
        }
        if(d!=0)
        {
            System.out.println("number 0f 3: "+d);
        }
        if(e!=0)
        {
            System.out.println("number 0f 4: "+e);
        }
        if(f!=0)
        {
            System.out.println("number 0f 5: "+f);
        }
        if(g!=0)
        {
            System.out.println("number 0f 6: "+g);
        }
        if(h!=0)
        {
            System.out.println("number 0f 7: "+h);
        }
        if(i!=0)
        {
            System.out.println("number 0f 8: "+i);
        }
        if(j!=0)
        {
            System.out.println("number 0f 9: "+j);
        }
    }
    
}
