class method
{
void display()
{
System.out.println("bike is running");
}
}
class SUPERinvokeclassmethod extends method
{
void display()
{
System.out.println("cycle is running");
}
void display1()
{

super.display();
display();
}
public static void main(String args[])
{
SUPERinvokeclassmethod mb1=new SUPERinvokeclassmethod();
mb1.display1();
}
}