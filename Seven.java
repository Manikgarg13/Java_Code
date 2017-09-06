import java.util.*;
class Seven{
	public static void main(String ar []){
		int a,b,c,d,e,f,i,j,check=0;
		double x,y,x1,y1,slope1=0,slope2=0;
		System.out.println("Enter integer for a, b, c, d, e, f"	);
		Scanner s= new Scanner(System.in);
		a=s.nextInt	();
		System.out.println("Enter next int");
		b=s.nextInt	();
		System.out.println("Enter next int");
		c=s.nextInt	();
		System.out.println("Enter next int");
		d=s.nextInt	();
		System.out.println("Enter next int");
		e=s.nextInt	();
		System.out.println("Enter next int");
		f=s.nextInt	();
		
		x=c/a;
		y=c/b;
		if(x<0 && y>0)
			slope1=y/x;
		if(x>0 && y>0)
			slope1=-y/x;
		if(x<0 && y<0)
			slope1=-y/x;
		if(x>0 && y<0)
			slope1=y/x;
		
		x1=f/d;
		y1=f/e;
		if(x1<0 && y1>0)
			slope2=y1/x1;
		if(x1>0 && y1>0)
			slope2=-y1/x1;
		if(x1<0 && y1<0)
			slope2=-y1/x1;
		if(x1>0 && y1<0)
			slope2=y1/x1;
	
		if((slope1) != (slope2) ){
			System.out.println("Lines are intersecting at");
			x= ((f*b)  - (e*c))/((b*d) - (e*a));
			y= ((f*a) - (d*c))/ (( e*a) - (b*d));
			System.out.println(x  + "  "  + y);
		}
		if( (slope1) == (slope2) 	){
			if( (a/d) == (b/e) && (b/e)== (c/f) )
				System.out.println("Lines are same");
			else
				System.out.println("Lines are parallel");
		
		}
		
	}
}
