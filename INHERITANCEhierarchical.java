class A
{
void display()
{
System.out.println("this is display");
}
}
class B extends A
{
void area1()
{
System.out.println("this is area1");
}
}
class C extends A
{
void area2()
{
System.out.println("this is area2");
}
}
class INHERITANCEhierarchical{
public static void main(String args[])
{
B mb1=new B();
C mb2=new C();
mb1.area1();
mb1.display();
mb2.area2();
mb2.display();
}
}