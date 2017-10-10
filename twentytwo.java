class twentytwo{
	public static void main(String ar[]){
		//int a[]=new int [];
		int a[]={3,53,5,2,7,8,3,56,2,8,9,73,5,6,28,93,75,62,93,56,29,38,67,29};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print("  "+a[i]);
		}
	}
	static void sort(int[] p){
		int i,j,temp;
		for(i=0;i<p.length;i++){
			for(j=i;j<p.length;j++){
				if(p[i]>=p[j]){
					temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		
	}
}
