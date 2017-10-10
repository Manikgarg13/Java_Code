import java.util.*;
public class twentyseven{
	public static void main(String ar[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a single digit");
	int a;
	a=s.nextInt();
	dolt(a);

	}
	
	static void dolt(int sum){
		if(sum==0)
			System.out.println("Zero");
		else if(sum==1)
			System.out.println("One");
		else if(sum==2)
			System.out.println("Two");
		else if(sum==3)
			System.out.println("Three");
		else if(sum==4)
			System.out.println("Four");
		else if(sum==5)
			System.out.println("Five");
		else if(sum==6)
			System.out.println("Six");
		else if(sum==7)
			System.out.println("Seven");
		else if(sum==8)
			System.out.println("Eight");
		else if(sum==9)
			System.out.println("Nine");
		
		int c=0,i;
		for(i=1;i<=sum;i++){
			c=c+i;		
		}
		System.out.println("Value of sum of first " + sum +" digits is "+c);
	}
	
}
