import java.lang.Math;
import java.util.*;
class twentyone{
      public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 positive doubles values ");
		double a,b,c;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if(a<=0 || b<=0 || c<=0 ){
			System.out.println("Invalid input");
			System.exit(0);
		}
		check(a,b,c);
		angles(a,b,c);
      }
      
      static void check(double x, double y, double z){
      	int t=0;
      	if( (x+y)>=z)
      		t++;
      	if( (x+z)>=y)
      		t++;
      	if( (z+y)>=x)
      		t++;
      	if(t!=3){
      		System.out.println("Triangle cannot be formed with these inputs ");
      		System.exit(0);
      	}      	
      		System.out.println("Triangle can be formed with these inputs ");
      }
 	
 	static void angles(double x, double y, double z){
 		double a,b,c;
 		a=( (y*y) +(z*z) -(x*x) )/ (2*y*z)  ;
 		b=( (x*x) +(z*z) -(y*y) )/ (2*x*z)  ;
 		c=( (y*y) +(x*x) -(z*z) )/ (2*y*x)  ;
 		System.out.println("Angle A is "+ (180*Math.acos(a))/3.14 );
 		System.out.println("Angle B is "+ (180*Math.acos(b))/3.14 );
 		System.out.println("Angle C is "+ (180*Math.acos(c))/3.14 );
 	}
}
