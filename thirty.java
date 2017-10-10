class thirty{
	public static void main(String ar[]){
		int a[]={1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,0};
		//int a[]={1,0,0,1};
		System.out.println("Decimal Value of array is " + decimalValue(a) );
	}

	static double decimalValue(int[] arr){
		int i,t=arr.length;
		double sum=0;
		t-=1;
		for(i=0;i<arr.length;i++){
			sum=sum+arr[i]*Math.pow(2,t);
			t--;
		}
		return sum;
	}
}