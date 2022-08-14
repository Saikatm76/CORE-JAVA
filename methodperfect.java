class method
{
    int i,sum;
    int calculate(int n)
    {
        sum=0;
          for(i=1;i<n;i++)  
          {
              if(n%i==0)
              {
                  sum=sum+i;
              }
          }
          if(sum==n)
          {
              System.out.println(n+" is perfect");
          }
          else
          {
              System.out.println(n+" is not perfect");
          }
          return n;
    }
}
class methodperfect{
    public static void main(String args[])
    {
    method mb1=new method();
      mb1.calculate(6);
    }
        
    }
            


