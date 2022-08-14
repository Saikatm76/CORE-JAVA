
public class constructorparameterized{
    int id;
    String name;
    constructorparameterized(int i,String n)
    {
       id=i;
       name= n;
    }
    void display()
    {
        System.out.println(id+" is "+name);
    }
    public static void main(String args[])
    {
        constructorparameterized s1=new constructorparameterized(5,"saikat");
       	 constructorparameterized s2=new constructorparameterized(6,"sk");
        s1.display();
	s2.display();
        
    }
     
    
}
