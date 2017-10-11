import java.math.*;
class fourtyone{
	public static void main(String ar[]){
		int n=4444,sum=0,i,j;
		BigInteger x= new BigInteger("4444");
		x=x.pow(n);

		//System.out.println(x);
		String s=x.toString();
		//System.out.println(s);
		for(i=0;i<s.length();i++){
			j=(int)s.charAt(i);
			sum=sum+j;
		}
		System.out.println("sum of digits in the expansion of 4444^4444:  " + sum);
	}
}
