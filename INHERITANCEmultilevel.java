class A{
void display()
{
System.out.println("this is display");
}
}
class B extends A{
void area()
{
System.out.println("this is area");
}
}
class C extends B{
void cube()
{
System.out.println("this is cube");
}
}
class INHERITANCEmultilevel{
public static void main(String args[])
{
C mb1=new C();
mb1.display();
mb1.area();
mb1.cube();
}
} 