class One
{
	public static void main(String ar[])
	{
		double z=99,x,y,min=99999,max=0,i;
		for(x=-3;x<=4;x=x+0.1){
			for(y=-5;y<=6;y=y+0.2){
				z= (x*x*x*x) + (x*x*x*y) + (x*x*y*y) + (x*y*y*y) + (y*y*y*y);

				if(z<=min){
					min=z;
					}
				if(z>=max){
					max=z;
				}
			}
		}
		System.out.println("For polynomial :- Z = X^4 + X^3Y + X^2Y^2 + XY^3 + Y^4");
		System.out.println("Minimum value of z is "+min);
		System.out.println("maximum value of z is "+max);
	}

}
