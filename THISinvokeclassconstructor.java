
public class THISinvokeclassconstructor {
  int id;
String name;
THISinvokeclassconstructor()    
{
    System.out.println("Default constructor invoked");
}
THISinvokeclassconstructor(int id,String name)
{
    this();
    this.id=id;
    this.name=name;
}
void display()
{
    System.out.println(id+" "+name);
}
public static void main(String args[])
{
    THISinvokeclassconstructor mb1=new THISinvokeclassconstructor(5,"sk");
   THISinvokeclassconstructor mb2=new THISinvokeclassconstructor(6,"saikat");
   mb1.display(); 
   mb2.display();
}
}
