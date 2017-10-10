import java.util.*;
class twentyfour{

	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		check(str);
	}

	static void check(String a){
			int i=a.length(),t=0,j,count=0,check=0;
			char b;
			char c[]= new char [i] ;
			for(t=0;t<i;t++)
				c[t]=a.charAt(t);
			for(t=0;t<i;t++){
				count++;
				j=(int)c[t];
				if(j==32){
					count--;
					System.out.print(count);
					count=0;
				}
			}
			System.out.print(count);
	}
}