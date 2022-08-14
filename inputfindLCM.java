import java.io.*;
public class inputfindLCM {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter two number: ");
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int i=1;
while(true)
{
if(i%n1==0 && i%n2==0)
{
System.out.println("The LCM Of Above Two Number Is "+i);
break;
}
else
i++;
}
}
}