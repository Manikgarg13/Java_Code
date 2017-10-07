import java.util.*;
public class twelve{
	public static void main(String ar[]) {
		Scanner s= new Scanner(System.in);

		System.out.println("Enter a int n");
		int n=s.nextInt();
		int a [] = new int [n];
		int b [] = new int [n];
		//int check1 [] = new int [n];
		//int check2 [] = new int [n];
		int i,j=0,k=0,l=0,count=0,m=0,o=0;

		System.out.println("Enter n elements for first array");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter n elements for second array");
		for(i=0;i<n;i++){
			b[i]=s.nextInt();
		}

		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(a[i]==b[j]){
					count++;
					b[j]=99999;
					break;
				}

			}
		}
			System.out.println("Your common elements in both arrays are :");
			System.out.println(count);

	}
}
