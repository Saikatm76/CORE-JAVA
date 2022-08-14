class method{
    method getA()
    {
       return this; 
    }
    void display()
    {
        System.out.println("hello java");
    }
}
public class THISreturncurrentclassinstance {
    public static void main(String args[])
    {
        new method().getA().display();
    }
    
}
