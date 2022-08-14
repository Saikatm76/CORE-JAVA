import java.io.*;
class findmarkspercentage{
	public static void main(String[] args)throws IOException {
	int m1,m2,m3,m4,m5,total,avg,per;	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter marks of 5 subjects out of 200");
	m1=Integer.parseInt(br.readLine());
	m2=Integer.parseInt(br.readLine());
	m3=Integer.parseInt(br.readLine());
	m4=Integer.parseInt(br.readLine());
	m5=Integer.parseInt(br.readLine());
	if(m1<=200)
	{
		if(m2<=200)
		{
			if(m3<=200)
			{
				if(m4<=200)
				{
					if(m5<=200)
					{
						total=m1+m2+m3+m4+m5;
						avg=(total/5);
						int tot=(total*100);
						per=(tot/1000);
						System.out.println("Total marks of 5 subjects: "+total);
						System.out.println("Average marks of 5 subjects: "+avg);
						System.out.println("percentage::"+per+"%");
					}
	else
	{
		System.out.println("Please Enter all the marks out of 200");
	}
				}
	else
	{
		System.out.println("Please Enter all the marks out of 200");
	}
			}
	else
	{
		System.out.println("Please Enter all the marks out of 200");
	}
		}
	else
	{
		System.out.println("Please Enter all the marks out of 200");
	}	
	}
	else
	{
		System.out.println(" Please Enter all the marks out of 200");
	}
	}
}