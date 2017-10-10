import java.util.*;
class thirtyeight{
	public static void main(String ar[]){
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a date , month , and a year in (dd-mm-yyyy) format ");
		String str;
		str=s.next();
		System.out.println( change(str) );
	}

	static String change(String a){
		int i=a.length(),count=0,j,t=0,m=0;
		char b;
		char c[]= new char[50];
		String s;
		if(i!=10){
			System.out.println("Sorry User! Your input size is not valid");
			System.exit(0);
		}
		for(i=0;i<a.length();i++){
			if(a.charAt(i)=='-')
				count++;
			c[i]=a.charAt(i);
		}
		if(count!=2){
			System.out.println("Sorry User! Your input format is not valid");
			System.exit(0);
		}

		j=(int)c[0] -48;
		j*=10;
		j+=(int)c[1] -48;
		if(j>=1 && j<32)
			t=1;
		if(t==0){
			System.out.println("Sorry User! Your input date is not valid");
			System.exit(0);
		}

		j=(int)c[6] -48;
		j*=10;
		j+=(int)c[7] -48;
		j*=10;
		j+=(int)c[8] -48;
		j*=10;
		j+=(int)c[9] -48;
//		System.out.println(j);

		if(j>0){
			m=1;
		}
		if(m==0){
		System.out.println("Sorry User! Your input year is not valid");
			System.exit(0);
		}

		j=(int)c[3] -48;
		j*=10;
		j+=(int)c[4] -48;
//		System.out.println(j);
		if(j==1){
			s="January";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);

		}
		else if(j==2){
			s="Febuary";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==3){
			s="March";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==4){
			s="April";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==5){
			s="May";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==6){
			s="june";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==7){
			s="July";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==8){
			s="August";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==9){
			s="September";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==10){
			s="october";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==11){
			s="november";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else if(j==12){
			s="December";
			for(i=0;i<s.length();i++){
				c[i+3]=s.charAt(i);
			}
			j=s.length();
			c[j+3]=a.charAt(5);
			c[j+4]=a.charAt(6);
			c[j+5]=a.charAt(7);
			c[j+6]=a.charAt(8);
			c[j+7]=a.charAt(9);
		}
		else {
			System.out.println("Sorry! your month is not valid");
		}

		a= new String(c);
		return a;
	}
}
