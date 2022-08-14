
public class copyconstructormethod2 {
    int i;
    String n;
  copyconstructormethod2(int id,String name)
  {
      i=id;
      n=name;
  }
  copyconstructormethod2()
  {
      
  }
  void display()
  {
      System.out.println(i+" of "+n);
  }
  public static void main(String args[])
  {
      copyconstructormethod2 mb1=new copyconstructormethod2(8,"saikat");
      copyconstructormethod2 mb2=new copyconstructormethod2();
      mb2.i=mb1.i;
      mb2.n=mb1.n;
      mb1.display();
      mb2.display();
  }
    
}
