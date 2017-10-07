import java.util.*;
public class fourteen{
	public static void main(String ar[]) {
		Scanner s= new Scanner(System.in);

		System.out.println("Enter a int n");
		int n=s.nextInt();
		int a [] = new int [n];
		int first=0,second=0,i,check;
		System.out.println("Enter n elements for array");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0; i<a.length ; i++){
			if(a[i]>=first){
				first=a[i];
			}
		}
		for(i=0; i<a.length ; i++){
			check=a[i];
			if(check!=first)
				if(check>=second)
					second=a[i];
		}
		System.out.println(second);
	}
}