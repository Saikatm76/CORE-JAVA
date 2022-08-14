class method{
    int i,sum,a,a1,b,c;
    int calculate(int n)
    {
       
       a=n/100;
       a1=n%100;
       b=a1/10;
       c=a1%10;
       sum=a*a*a+b*b*b+c*c*c;
       if(sum==n)
       {
           System.out.println(n+" is a amstrong number");
       }
       else
       {
           System.out.println(n+" is not amstrong");
       }
       return n;
    }
}
public class methodamstrong {
    public static void main(String args[])
    {
 method mb1=new method();
 mb1.calculate(153);
}
}