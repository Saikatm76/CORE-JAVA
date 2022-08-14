abstract class method{
method()
{
System.out.println("bike is running");
}
void test()
{
System.out.println("car is running");
}
abstract void display();

}
class ABSTRACTclass extends method{
void display()
{
System.out.println("cycle is running");
}
public static void main(String args[])
{
method mb1=new ABSTRACTclass();
mb1.test();
mb1.display();
}
}