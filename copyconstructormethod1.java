
public class copyconstructormethod1 {
    int i;
    String n;
   copyconstructormethod1(int id,String name)
   {
       i=id;
       n=name;
   }
  copyconstructormethod1(copyconstructormethod1 br)
  {
   i=br.i;
   n=br.n;
  }
  void display()
  {
      System.out.println(n+" of "+i);
  }
  public static void main(String args[])
  {
      copyconstructormethod1 mb1=new copyconstructormethod1(3,"saikat");
      copyconstructormethod1 mb2=new copyconstructormethod1(mb1);
      mb1.display();
      mb2.display();
  }
}
