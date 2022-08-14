class method
{
	double width;
	double height;
	double depth;
	void display()
	{
		double v;
		v=width*height*depth;
		System.out.println("volume of the box"+v);
	}
}
class methodboxvolume{
	public static void main(String[] args) {
		method mb1=new method();
        method mb2=new method();
        mb1.width=20;
        mb1.height=10;
        mb1.depth=5;
        mb1.display();
        mb2.width=10;
        mb2.height=15;
        mb2.depth=5;
        mb2.display();
	}
}