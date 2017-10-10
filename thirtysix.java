import java.util.*;
class thirtysix{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str;
		str=s.next();
		System.out.println( change(str) );
	}

	static String change(String a){
		int i=a.length();
		char b;
		char c[]= new char [i] ;
		for(i=a.length() -1 ;i>=0 ; i--){
			if(i==a.length()-1){
				b=a.charAt(i);
				c[0]=a.charAt(i);
			}
			else{
				c[i+1]=a.charAt(i);
			}
		}
		a= new String(c);
		return a;
	}

}
