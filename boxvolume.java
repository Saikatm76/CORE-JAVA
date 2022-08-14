class method
{
	double width;
	double height;
	double depth;
}
class boxvolume
{
	public static void main(String[] args) {
		double v;
		method mb1=new method();
		method mb2=new method();
		mb1.width=10;
		mb1.height=20;
		mb1.depth=5;
		v=mb1.width*mb1.height*mb1.depth;
		System.out.println("volume of 1st box: "+v);
		mb2.width=15;
		mb2.height=10;
		mb2.depth=5;
		v=mb2.width*mb2.height*mb2.depth;
		System.out.println("volume of 2nd box: "+v);
	}
}