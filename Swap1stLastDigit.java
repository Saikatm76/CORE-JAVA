import java.io.*;
public class Swap1stLastDigit {
  public static void main(String args[])throws IOException{
   int n,temp,l,m,mid,t,str,p;
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   System.out.println("How many digit number you want:");
   p=Integer.parseInt(br.readLine());
   System.out.println("Enter a number");
   n=Integer.parseInt(br.readLine());
   temp=n;
   l=temp%10;
   str=temp/10;
   m=0;
   while(str>10)
   {
      t=str%10;
       str=str/10; 
      m=m*10+t;
   }
  mid=0;
   while(m!=0)
   {
       int q=m%10;
       m=m/10;
       mid=mid*10+q;
   }
   while(temp>10)
   {
       temp=temp/10;
   }
   int mul=1;
   for(int i=1;i<p;i++)
   {
     mul=mul*10;  
   }
  int fin=(mul*l)+(mid*10)+temp;
  System.out.println(fin);
}  
}
