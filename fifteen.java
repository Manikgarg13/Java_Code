import java.util.*;
class fifteen{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str;
		str=s.next();

		if(str.length()>50){
			System.out.println("Sorry! string length exceeded 50");
			System.exit(0);
		}

		System.out.println("Enter a number");
		int a;
		a=s.nextInt();
		if(a>=str.length()){
			System.out.println("Sorry! input number exceed current length of string");
			System.exit(0);
		}
		System.out.println( change(str,a) );
	}

	static String change(String a, int x){
		int i=a.length(),t=0;
		char b;
		char c[]= new char [i-1] ;
		for(t=0;t<x;t++){
			c[t]=a.charAt(t);
		}
		for(t=x;t<i-1;t++){
			c[t]=a.charAt(t+1);
		}
		a= new String(c);
		return a;
	}

}
