class STATICcountervariable{
static int c=0;
STATICcountervariable()
{
c++;
System.out.println(c);
}
public static void main(String args[])
{
STATICcountervariable mb1=new STATICcountervariable();
STATICcountervariable mb2=new STATICcountervariable();
STATICcountervariable mb3=new STATICcountervariable();
}
}