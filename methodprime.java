class method
{
    int c,i,s;
    int calculate(int n)
    {
        c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
       }
        if(c==2)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not prime");
        }
    return n;  
}

}   
public class methodprime {
    public static void main(String args[])
    {
        method mb1=new method();
        mb1.calculate(2);
    }
    
}
    

