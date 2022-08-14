interface area{
	final static float pi=3.14f;
	public float compute(float x,float y);
}
class rectangle implements area
{
public float compute(float x,float y)
{
	return(x*y);
}
}
class circle implements area{
	public float compute(float x,float y)
	{
		return(pi*x*x);
	}
}
class INTERFACEarea{
	public static void main(String[] args) {
		rectangle mb1=new rectangle();
		circle mb2=new circle();
		System.out.println("Area of rectangle "+mb1.compute(6.3f,7.4f));
		System.out.println("Area of circle "+mb2.compute(6.3f,7.4f));
	}
}