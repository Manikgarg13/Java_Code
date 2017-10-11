import java.util.*;

public class seventeen{
	public static void main(String ar[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a int n");
		int n=s.nextInt();
		int a [] = new int [n];
		int o=1;
		for(int i=0; i<n; i++,o=o+2){
			a[i] += o;
		}
		for( int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}