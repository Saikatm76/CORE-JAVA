class arraymultidimensional
{
	public static void main(String[] args) {
		int i,j;
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
	    }
	}
}