class arraymethodlowestnumber{
	public static void method(int arr[]) {
		int i;
		int min=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				
			}
                    
		}
  System.out.println(min);
	}
		public static void main(String[] args) {
			int a[]={2,3,5,4};
			method(a);
		
	}
}