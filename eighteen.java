import java.util.*;
class eighteen{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		double a;
		int t;
		System.out.println("How many doubles you want to enter");
		t=sc.nextInt();

		double counte=0,avge=0,smallest=99999,largest=0;
		while(t>0){
			System.out.println("Enter a double");
			a=sc.nextInt();
			if(a>=largest)
				largest=a;
			if(a<smallest)
				smallest=a;

			counte++;
			avge+=a;
			t--;
		}
		double e=0,o=0;
		e=avge/counte;

		if(smallest==99999)
			smallest=0;
		System.out.println("Smallest : "+smallest);
		System.out.println("largest : "+largest);
		System.out.println("Average of even numbers : "+e);




	}
}