class student{
    THISpassargumentinconstructor obj;
    student(THISpassargumentinconstructor obj)
         {
             this.obj=obj;
         }
 void display()
 {
     System.out.println(obj.data);
 }
}
public class THISpassargumentinconstructor{
 int data=10;
 THISpassargumentinconstructor()
 {
     student mb1=new student(this);
     mb1.display();
 }
 public static void main(String args[])
 {
    THISpassargumentinconstructor mb2=new THISpassargumentinconstructor(); 
 }
}