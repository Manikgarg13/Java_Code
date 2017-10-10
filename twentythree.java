class twentythree{
	public static void main(String ar[]){
		String s="10111010111011101100011111";
		count c=new count();
		c.count(s);
		System.out.println("no. of zeros are " + c.show1());
		System.out.println("no. of one are " + c.show2());
	}

}
class count{
	private int zero=0;
	private int one=0;
	Object count(String s){
		int y;
		for(y=0;y<s.length();y++){
			if(s.charAt(y)=='0')
				zero++;
			one++;
		}
		return this;
	}
	public int show1(){
		return zero;
	}
	public int show2(){
			return one;
		}

}