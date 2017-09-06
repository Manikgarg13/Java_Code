class Six{
	public static void main(String []ar){

		int x,y=0;

		for(x=1;x<=1001;x++){
			y=0;

		if( x%7!=0 && x%11!=0){
				System.out.print("    " + x);
				y=1;
			}

			if( (x%7==0 || x%11==0) && y==0 ){
				if(x%2!=0){
				System.out.print("    " + x);					}
			}
		}
	}
}
