
public class THISclassinstancevariable {
    int id;
    String name;
    THISclassinstancevariable(int id,String name)
    {
        this.id=id;
        this.name=name;
        
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        THISclassinstancevariable mb1=new THISclassinstancevariable(5,"saikat");
        THISclassinstancevariable mb2=new THISclassinstancevariable(6,"sk");
        mb1.display();
        mb2.display();
}

}