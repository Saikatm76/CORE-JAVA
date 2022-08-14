class STATICvariable{
int i;
String n;
static String clg="BB COLLEGE";
STATICvariable(int id,String name)
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
STATICvariable mb1=new STATICvariable(1,"SAIKAT");
mb1.display();
}
}