import java.io.*;
public class checktriangle {
    public static void main(String args[])throws IOException
    {
        int side1,side2,side3;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the 3 sides of a triangle ");
         side1=Integer.parseInt(br.readLine());
         side2=Integer.parseInt(br.readLine());
         side3=Integer.parseInt(br.readLine());
         if (side1==side2 && side2==side3 && side3==side1 )
         {
              System.out.println("Triangle Is Equilateral");
         }
         else if(side1==side2 || side2==side3 || side3==side1)
         {
              System.out.println("Triangle is Isosceles");
         }
         else
         {
              System.out.println("Triangle is Scalene");
         }
    }
    
}
