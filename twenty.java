import java.util.*;
import java.lang.Math;
class twenty{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		double x1,x2,x3,y1,y2,y3;
		System.out.println("Enter x and y coor. for 1st point");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.println("Enter x and y coor. for 2nd point");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		System.out.println("Enter x and y coor. for 3rd point");
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		double a,b,c,peri;
		a=distance(x1,y1,x2,y2);
		b=distance(x1,y1,x3,y3);
		c=distance(x2,y2,x3,y3);
		peri=perimeter(a,b,c);
		System.out.println("Perimeter of the triangle formed by these 3 points " +peri);
	}

	static double distance(double a, double b, double c, double d){
		double temp;
		temp=Math.sqrt( (c-a)*(c-a) + (d-b)*(d-b) );
		return temp;
	}

	static double perimeter(double a, double b , double c){
		return a+b+c;
	}
}