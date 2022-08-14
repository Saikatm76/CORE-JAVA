
public class constructordefault {
    int id;
    String name;
    void display()
    {
        System.out.println(id+" is "+name);
    }
        public static void main(String args[])
        {
            constructordefault mb1=new constructordefault();
            constructordefault mb2=new constructordefault();
            mb1.display();
            mb2.display();
        }
    }
    

