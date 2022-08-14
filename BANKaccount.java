import java.io.*;
class method{
    String depname;
    String actype;
    int acno;
    int dep;
    int with;
    int t;
    void initdata(String a,String b,int c)
    {
        depname=a;
        actype=b;
        acno=c;
           
    }
    void deposit(int d)
    {
        dep=d;
        System.out.println("Deposit Price: "+dep);
    }
    void withdrawl(int e)
    {
        with=e;
        if(with>dep)
        {
            System.out.println("Wrong Enter");
        }
        else
        {
            System.out.println("Withdrawl: "+with);
            t=dep-with;
        }
    }
    void display()
    {
        System.out.println("..............");
        System.out.println("..............");
        System.out.println("Depositor: "+depname);
        System.out.println("Account Number: "+actype);
        System.out.println("Account Type: "+acno); 
        if(with>dep)
        {
            System.out.println("Current Balance: "+dep);
        }
        else
        {
            System.out.println("Current Balance: "+t);
        }
}
}
        
    public class BANKaccount{
        public static void main(String args[])throws IOException{
           
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              for(int i=0;i<5;i++)
            {
             System.out.println("Enter your choice: ");
             String choice=br.readLine();
             switch(choice)
             {
                 case "yes":
        System.out.println("Enter the depositor name: ");
        String n1=br.readLine();
        System.out.println("Enter the Account type: ");
        String n2=br.readLine();
        System.out.println("Enter the Account number: ");
        int n3=Integer.parseInt(br.readLine());
          method mb1=new method();
        mb1.initdata(n1,n2,n3);
        System.out.println("Enter the amount you want to deposit: ");
        int n4=Integer.parseInt(br.readLine());
        mb1.deposit(n4);
        System.out.println("Enter the amount you want to withdrawl: ");
        int n5=Integer.parseInt(br.readLine());
        mb1.withdrawl(n5);
        mb1.display();
         break;
         
        case "no":
        break;

        default: System.out.println("plz select yes/no");
        }
        
        }

        }
    }
    
    

