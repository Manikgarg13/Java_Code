import java.util.*;
public class thirteen{
	public static void main(String ar[]) {
		Scanner s= new Scanner(System.in);

		System.out.println("Enter a int n");
		int n=s.nextInt();
		int a [] = new int [n];
		int b [] = new int [n];
		//int check1 [] = new int [n];
		//int check2 [] = new int [n];
		int i;

		System.out.println("Enter n elements for first array");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}

		System.out.println("Enter n elements for second array");
		for(i=0;i<n;i++){
			b[i]=s.nextInt();
		}

		int c[] = new int [2*n];
		int j=0,k=0;
		for(i=0;i<2*n;i++){
			if(i%2==0)
				c[i]=a[j++];
			else
				c[i]=b[k++];
		}

		System.out.println("Elements in third array in alternative way :");
				for(i=0;i<2*n;i++)
					System.out.print(c[i]+"  ");

	}
}