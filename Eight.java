import java.util.*;
class Eight{
	public static void main(String ar []){
		int a,b,c,i,j,check=0;
		double x,y,x1,y1,slope1=0,slope2=0;
		System.out.println("Enter integer for a, b, c"	);
		Scanner s= new Scanner(System.in);
		a=s.nextInt	();
		System.out.println("Enter next int");
		b=s.nextInt	();
		System.out.println("Enter next int");
		c=s.nextInt	();

		x= (b*b) - (4*a*c);
		
		if(x > 0 ){
			x=Math.sqrt(x);
			if(x!=0){
			System.out.println(" Your roots are real and distinct ");
			y= (-b + x) / (2*a) ;
			y1= (-b - x) / (2*a) ;
			System.out.println(y + "   "  + y1);
			}
			else
			{
			System.out.println(" Your roots are same ");
			y= (-b) / (2*a) ;
			y1=(-b) / (2*a) ;
			System.out.println(y + "   "  + y1);
			}
		}
		else{
				System.out.println("Roots are imaginary");
				System.out.println(  "(-" + b + "  +/- "  + Math.sqrt(-x) + "i) /" + "2*" + a );
		
		}
				
	}
}
