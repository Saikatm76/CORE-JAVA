class arraymatrixaddition{
	public static void main(String[] args) {
		int arr1[][]={{1,2,3,1},{3,2,1,4},{4,2,1,1}};
		int arr2[][]={{4,1,3,2},{1,1,4,3},{1,3,4,2}};
		int arr3[][]={{1,2,3,4},{3,4,2,1},{1,2,3,4}};
		int arr[][] = new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=arr1[i][j]+arr2[i][j]+arr3[i][j];
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

	}
}