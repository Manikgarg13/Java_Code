import java.util.*;
class fourty extends twentysix{
	public static void main(String ar[]){
		Scanner s= new Scanner(System.in);
		int x,y,z,first,second,year1,year2,count=0;

		System.out.println("Enter 1st date, month and year");
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		check(x,y,z);
		year1=z;
		first=date(x,y,z);

		System.out.println("Enter 2nd date, month and year");
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		check(x,y,z);
		year2=z;
		second=date(x,y,z);

		if(year1>year2){
			count=checkyear(year1,year2);
			count=count-second;
			count+=first;
		}
		if(year1<year2){
			count=checkyear(year2,year1);
			count=count-first;
			count+=second;
		}
		if(year1==year2){
			if(second>first)
				System.out.println( "Difference  " + (second-first) );
			else
				System.out.println( "Difference  " + (first-second) );
		}
		else{
			System.out.println(" Difference  " + count );
		}

	}

	static boolean isleap(int a){
		if( ( ((a%4)==0) && ((a%100)!=0) )|| ((a%400)==0) )
			return true;
		else
			return false;
	}

	static int checkyear(int a,int b){
		int days=0;
		while(b<a){
			if(isleap(b))
				days+=366;
			else
				days+=365;
			b++;
		}
		return days;
	}

	static void check(int a,int b,int c){

		if(b>12 || b<1 ){
			System.out.println("Invalid month");
			System.exit(0);
		}
		switch(b){
			case 1:
			if(a<1 ||a>31){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;
			case 2:
			if(a<1 ||a>29){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 3:
			if(a<1 ||a>31){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 4:

			if(a<1 ||a>30){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 5:

			if(a<1 ||a>31){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 6:

			if(a<1 ||a>30){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 7:

			if(a<1 ||a>31){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 8:

			if(a<1 ||a>31){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 9:
			if(a<1 ||a>30){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 10:

			if(a<1 ||a>31){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 11:

			if(a<1 ||a>30){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;

			case 12:

			if(a<1 ||a>31){
			System.out.println("Invalid date");
			System.exit(0);
			}	break;
			default:
				System.out.println();
		}
	}
}