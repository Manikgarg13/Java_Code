import java.math.*;
class sumofdigit{
	public static void main(String ar[]){
		int n=4444,sum=0,i,j=0;
		BigInteger x= new BigInteger("4444");
//		BigInteger y= new BigInteger(
		x=x.pow(n);

		//System.out.println(x);
		String s=x.toString();
//System.out.println(s.charAt(0));
//			j=  s.charAt(0);

		for(i=0;i<s.length();i++){
			j=s.charAt(i);
			sum=sum+j-48;
		}
		System.out.println(sum);
	}
}
