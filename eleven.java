import java.util.*;
class eleven{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a int");
		a=sc.nextInt();
		int counte=0,counto=0,avge=0,avgo=0,smallest=99999,largest=0;
		while(a>0){
			if(a>=largest)
				largest=a;
			if(a<smallest)
				smallest=a;
			if(a%2==0){
				counte++;
				avge+=a;
			}
			else {
				counto++;
				avgo+=a;
			}
			System.out.println("Enter a int");
			a=sc.nextInt();
		}
		double e=0,o=0,c=0;
		try{

		e=avge/counte;
		c=1;
		o=avgo/counto;

		}
		catch(Exception ex){
			if(c!=1){
				try{
					o=avgo/counto;
				}
				catch(Exception exe){
				}
			}
			if(smallest==99999)
				smallest=0;
			System.out.println("Smallest : "+smallest);
			System.out.println("largest : "+largest);
			System.out.println("Average of even numbers : "+e);
			System.out.println("Average of odd numbers : "+o);
		}


	}
}