import java.util.*;
public class twentysix{
	public static void main(String ar[]){
		Scanner s= new Scanner(System.in);
		int a,b,c,fin;
		System.out.println("Enter date, month and year");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
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
		fin=date(a,b,c);
		System.out.println("Number of days passed since 1st jaun. " + (fin));

	}

	static int date(int dd, int mm, int yy){
		int leap,i,j,fin=0;
		if( ( ((yy%4)==0) && ((yy%100)!=0) )|| ((yy%400)==0) )
			leap=1;
		else
			leap=0;
		System.out.println("Is leap " + leap);
		if(leap==1){
			for(i=1;i<mm;i++){
				if(i==1)
					fin +=31;
				if(i==2)
					fin +=29;
				if(i==3)
					fin +=31;
				if(i==4)
					fin +=30;
				if(i==5)
					fin +=31;
				if(i==6)
					fin +=30;
				if(i==7)
					fin +=31;
				if(i==8)
					fin +=31;
				if(i==9)
					fin +=30;
				if(i==10)
					fin +=31;
				if(i==11)
					fin +=30;
				if(i==12)
					fin +=31;
		//		System.out.println(fin);
			}

			fin+=dd;
		//	System.out.println(fin);
			return fin;

		}
		else{
			for(i=1;i<mm;i++){
				if(i==1)
					fin +=31;
				if(i==2)
					fin +=28;
				if(i==3)
					fin +=31;
				if(i==4)
					fin +=30;
				if(i==5)
					fin +=31;
				if(i==6)
					fin +=30;
				if(i==7)
					fin +=31;
				if(i==8)
					fin +=31;
				if(i==9)
					fin +=30;
				if(i==10)
					fin +=31;
				if(i==11)
					fin +=30;
				if(i==12)
					fin +=31;
			}
			fin+=dd;
			return fin;

		}
	}

}
