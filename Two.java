import java.math.*;
class Two{
	public static void main(String ar[]){


		BigInteger x=new BigInteger("1");
		int y=1,zeros=0;

		for(y=1;y<1002;y++){
			x=x.multiply(BigInteger.valueOf(y));
		}
		System.out.println("Factorial of 1001! is "+ x);
		String s = x.toString();
		System.out.println("Number of digits in the expansion of 1001! is " + s.length());

		for(y=0;y<s.length();y++){
			if(s.charAt(y)=='0'){
				zeros++;
			}else
			zeros=0;
		}

		System.out.println("Number of terminal zeros in the expansion of 1001! is " + zeros);

	}
}
