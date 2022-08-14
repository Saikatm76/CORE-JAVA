class method
{
	double r;
	double area()
	{
		return(3.14*r*r);
	}
	double circumference()
	{
		return(2*3.14*r);
	}
	void setdim(double radius)
	{
      r=radius;
	}
}
class methodcalculatecircle
{
	public static void main(String[] args) {
		double v;
		method mb1=new method();
		method mb2=new method();
		mb1.setdim(5);
		mb2.setdim(3);
        v=mb1.area();
        System.out.println("the area of circle: "+v);
        v=mb2.circumference();
        System.out.println("the circumference of circle: "+v);
	}
}