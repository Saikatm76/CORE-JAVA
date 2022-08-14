import java.io.*;
class STRINGpalindrome{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("write");
		String s1=br.readLine();
		int p=s1.length();
		String st="";
                System.out.println(s1.toUpperCase());
		for(int i=p-1;i>=0;i--)
		{
			st=st+s1.charAt(i);
		}
		if(st.equals(s1))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}

	}
}