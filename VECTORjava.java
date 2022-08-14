import java.util.Vector;
public class VECTORjava{
    public static void main(String args[])
    {
        Vector<String> vct=new Vector<>();
        vct.add("first");
        vct.add("second");
        vct.add("third");
        System.out.println(vct);
        vct.add(2,"random");
        System.out.println(vct);
        System.out.println("Element at no. 3 is: "+vct.get(3));
        System.out.println("The first element of this vector is: "+vct.firstElement());
        System.out.println("The last element of this vector is: "+vct.lastElement());
        System.out.println("Is this vector is empty? "+vct.isEmpty());
    }
}