
public class THISinvokeclassmethod {
    void display1()
    {
        System.out.println("method is invoked");
    }
    void display2()
    {
        this.display1();
    }
    void display3()
    {
        this.display2();
    }
    public static void main(String args[])
    {
        THISinvokeclassmethod mb1=new THISinvokeclassmethod();
        mb1.display3();
    }
    
}
