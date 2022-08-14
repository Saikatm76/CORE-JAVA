
public class constructoroverloading {
    int i;
    String n;
    int a;
   constructoroverloading(int id,String name)
   {
       i=id;
       n=name;
   }
   constructoroverloading(int id,String name,int age)
   {
       i=id;
       n=name;
       a=age;
   }
   void display()
   {
       System.out.println(i+" of "+n+" is "+a);
   }
   public static void main(String args[])
   {
       constructoroverloading mb1=new constructoroverloading(5,"saikat");
       constructoroverloading mb2=new constructoroverloading(8,"sk",21);
       mb1.display();
       mb2.display();
   }
    
}
