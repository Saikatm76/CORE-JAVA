class method{
	double width,height,depth;
	double volume()
	{
		return(width*height*depth);
	}
	void setdim(double w,double h,double d)
	{
      width=w;
      height=h;
      depth=d;
	}
}
class methodboxvolumeparameter{
	public static void main(String[] args) {
		double v;
		method mb1=new method();
        method mb2=new method();
        mb1.setdim(10,15,20);
        v=mb1.volume();
        System.out.println("volume of 1st box is: "+v);
        mb2.setdim(15,20,25);
        v=mb2.volume();
        System.out.println("volume of 2nd box is: "+v);
	}
}