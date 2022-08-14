import java.io.*;
class vshape{
	void volume()
	{

	}
	void surfacearea()
	{

	}
}
	class box extends vshape{
            double l;
            double w;
            double h;
		box(double p,double q,double r)
		{
l=p;
w=q;
h=r;
 System.out.println("FOR BOX");
System.out.println("Length::"+l);
 System.out.println("Width::"+w);
  System.out.println("Height::"+h);
		}
       
		
		void volume()
		{
double a=l*w*h;
System.out.println("The volume of box :"+a);
		}
void surfacearea()
{
double b=2*(h*w)+2*(h*l)+2*(w*l);
System.out.println("The surfacearea of box :"+b); 
System.out.println(".................................................");
	}
}
class cube extends vshape{
    double e;
		cube(double y)
		{
 e=y;
 System.out.println("FOR CUBE");
  System.out.println("Edge::"+e);
		}
		void volume()
		{
double c=e*e*e;
System.out.println("The volume of cube :"+c);
		}
void surfacearea()
{
	double d=6*e*e;
	System.out.println("The surface of cube"+d);
System.out.println(".................................................");
	}
}
class cylinder extends vshape{
    double m;
    double t;
		cylinder(double o,double z)
		{
 m=o;
 t=z;
 System.out.println("FOR CYLINDER");
 System.out.println("Radius::"+m);
  System.out.println("Height::"+t);
		}
		void volume()
		{
double v=3.14*m*m*t;
System.out.println("The volume of cylinder :"+v);
		}
void surfacearea()
{
	double s=2*3.14*m*t+2*3.14*m*m;
	System.out.println("The surfacearea of cylinder :"+s);
	}
}
class shape{
	public static void main(String[] args)throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Length of Box: ");
Double n1=Double.parseDouble(br.readLine());
System.out.println("Enter the Width of Box: ");
Double n2=Double.parseDouble(br.readLine());
System.out.println("Enter the Height of Box: ");

Double n3=Double.parseDouble(br.readLine());
box mb1=new box(n1,n2,n3);
mb1.volume();
mb1.surfacearea();
System.out.println("Enter the Edge of Cube: ");
Double n4=Double.parseDouble(br.readLine());
cube mb2=new cube(n4);
mb2.volume();
mb2.surfacearea();
System.out.println("Enter the Radious of Cylinder: ");
Double n5=Double.parseDouble(br.readLine());
System.out.println("Enter the Height of Cylinder: ");
Double n6=Double.parseDouble(br.readLine());
		cylinder mb3=new cylinder(n5,n6);
		mb3.volume();
		mb3.surfacearea();
	}

}
