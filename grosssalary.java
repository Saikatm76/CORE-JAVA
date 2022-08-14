import java.io.*;
public class grosssalary {
 public static void main(String args[])throws IOException
 {
      int g,hra,da;
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the basic salary: ");
     int n=Integer.parseInt(br.readLine());
    
     if(n<=10000)
     {
          hra=(n*20)/100;
         da=(n*80)/100;
         g=hra+da+n;
         System.out.println("Gross salary is: "+g);
     }
     
     else if(n<=20000)
     {
        hra=(n*25)/100;
         da=(n*90)/100; 
          g=hra+da+n;
           System.out.println("Gross salary is: "+g);
     }
     else
     {
      hra=(n*30)/100;
        da=(n*95)/100;  
          g=hra+da+n;
           System.out.println("Gross salary is: "+g);   
     }
 }
}
