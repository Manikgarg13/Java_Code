import java.util.*;
class thirtynine{
	static int date,month,year,zerobased;
	static boolean iscorrect(String a){
		int i=a.length(),count=0,j,t=0,m=0;
		char b;
		char c[]= new char[50];
		String s;
		if(i!=10){
			System.out.println("Sorry User! Your input size is not valid");
			return false;
		}
		for(i=0;i<a.length();i++){
			if(a.charAt(i)=='-')
				count++;
			c[i]=a.charAt(i);
		}
		if(count!=2){
			System.out.println("Sorry User! Your input format is not valid");
			return false;
		}

		j=(int)c[0] -48;
		j*=10;
		j+=(int)c[1] -48;
		date=j;
		if(j>=1 && j<32)
			t=1;
		if(t==0){

			System.out.println("Sorry User! Your input date is not valid");
			return false;
		}

		j=(int)c[6] -48;
		j*=10;
		j+=(int)c[7] -48;
		j*=10;
		j+=(int)c[8] -48;
		j*=10;
		j+=(int)c[9] -48;
		year=j;
		if(j>0)
			m=1;

		if(m==0){

		System.out.println("Sorry User! Your input year is not valid");
			return false;
		}

		j=(int)c[3] -48;
		j*=10;
		j+=(int)c[4] -48;
		month=j;
		if(j<=1 || j>=12 ){

			System.out.println("Sorry! your month is not valid");
			return false;
		}
		System.out.println("your date is valid");
		return true;
		}

	static int zeller(){
		zerobased=year/100;
		//year%=100;
		int day;

		day= ( date+ (13*(month+1)/5) +year + (year/4) +(year/100)+  (year/400) ) % 7;
		return day;
	}

	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a date dd-mm-yyyy");
		String s=sc.next();
		System.out.println(iscorrect(s));

		if(iscorrect(s)){
			int dumb=zeller();
			switch(dumb){
				case 0:
					System.out.println("Monday");
					break;
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Monday");
					break;
				case 3:
					System.out.println("Monday");
					break;
				case 4:
					System.out.println("Monday");
					break;
				case 5:
					System.out.println("Monday");
					break;
				case 6:
					System.out.println("Monday");
					break;
				default:
					System.out.println();
			}
		}
	}
}
