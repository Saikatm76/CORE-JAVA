
public class THISpassargumentinmethod {
    void display1(THISpassargumentinmethod obj)
    {
        System.out.println("passing argument");
    }
    void display2()
    {
    display1(this);
}
    public static void main(String args[])
    {
        THISpassargumentinmethod mb1=new THISpassargumentinmethod();
        mb1.display2();
    }
}