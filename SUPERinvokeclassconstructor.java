class method
{
method()
{
System.out.println("bike is running");
}
}
class SUPERinvokeclassconstructor extends method
{
 SUPERinvokeclassconstructor()
{
super();
System.out.println("cycle is running");
}
public static void main(String args[])
{
SUPERinvokeclassconstructor mb1=new SUPERinvokeclassconstructor();
}
}