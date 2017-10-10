import java.util.*;
class thirtyseven{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str;
		str=s.next();
		System.out.println("Enter two numbers");
		int a,b;
		a=s.nextInt();
		b=s.nextInt();

		System.out.println( change(str,a,b) );
	}

	static String change(String a, int x , int y){
		int i=a.length(),t=0;
		char b;
		char c[]= new char [i] ;
		for(i=a.length() -1 ;i>=0 ; i--){
			c[i]=a.charAt(i);
		}
		for(i=a.length() -1 ;i>=0 ; i--){
			if( (i==x || i==y ) && t==0 ){
				b=c[x];
				c[x]=c[y];
				c[y]=b;
				t=1;
			}
		}

		a= new String(c);
		return a;
	}

}
