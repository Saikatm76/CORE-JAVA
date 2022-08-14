class pattern2{
	public static void main(String[] args) {
	int j;
		for(int i=0;i<=3;i++)
		{
		
			for(j=0;j<=2-i;j++)
			{
             System.out.print(" ");
			}
			for(j=9;j>=9-i;j--)
				{
                 
					System.out.print(j);
			
				}
				for(j=10-i;j<=9;j++)
				{
					System.out.print(j);
				}
				System.out.println();
		}
	}
}