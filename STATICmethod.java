class STATICmethod{
int i;
String n;
static String clg="BB COLLEGE";
static void change()
{
clg="AEC";
}
STATICmethod(int id,String name)
{
i=id;
n=name;
}
void display()
{
System.out.println(i+" "+n+" "+clg);
}
public static void main(String args[])
{
STATICmethod.change();
STATICmethod mb1=new STATICmethod(1,"sk");
STATICmethod mb2=new STATICmethod(1,"AB");
mb1.display();
mb2.display();
}
}