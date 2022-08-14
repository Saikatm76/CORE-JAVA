import java .io.*;
public class largestamong3numbers {
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Three Number: ");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        if(a>b && a>c)
        {
        System.out.println(a+" is largest");
    }
        else if(b>c)
        {
       System.out.println(b+" is largest");     
        }
        else
        {
            System.out.println(c+" is largest");
        }
    }      
    
}
