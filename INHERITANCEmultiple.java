interface medical{
	final static String bloodgrp="O+";
	final static float height=5.4f;
	public void putdetails();
}
class studentinfo{
	String studentname;
	String studentid;
	void stinfo()
	{
		System.out.println("student name::"+studentname);
		System.out.println("student id::"+studentid);
	}
}
class markdet extends studentinfo{
	int java=45;
	int math=50;
	void markdetails()
	{
		System.out.println("the number get in java::"+java);
		System.out.println("the number get in math::"+math);
	}
}
class stinfodet extends markdet implements medical {
	stinfodet(String stname,String stid)
	{
		studentname=stname;
		studentid=stid;
	}
	public void putdetails()
	{
		System.out.println("the student's height::"+height);
		System.out.println("the student's blood group::"+bloodgrp);
	}
	void totalmarks()
	{
		int total;
		total=java+math;
		stinfo();
		putdetails();
		markdetails();
		System.out.println("Total marks is::"+total);
	}

}
class INHERITANCEmultiple{
	public static void main(String[] args) {
		stinfodet mb1=new stinfodet("priya","7");
		mb1.totalmarks();
	}
}