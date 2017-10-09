import java.util.*;
class sixteen{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		char c;
		int i,j,count=0;
		for(i=0;i<str.length();i++){
			c=str.charAt(i);
			j=(int)c;
			if((j==32) || (j>=97 && j<=122)){
				count++;
			}
		}
		if(count!=(str.length())){
			System.out.println("Invalid Input!");
			System.exit(0);
		}
		System.out.println(change(str));


	}

	static String change(String a){
			int i=a.length(),t=0,j;
			char b;
			char c[]= new char [i] ;
			for(t=0;t<i;t++){
				b=a.charAt(t);
				j=(int)b;
				j++;
				if(j==123)
					j=97;
				if(j==33)
					j--;
				b=(char)j;
				c[t]=b;
			}
			a= new String(c);
			return a;
	}
}