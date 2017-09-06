import java.util.*;
import java.math.*;
class Four{
	public static void main(String []ar){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a decimal point");
		String input=s.nextLine();
		int y,count=0;
		for(y=0;y<input.length();y++){
			if(input.charAt(y)=='.')
				count=y;
		}
		if(count==0)
			System.out.println("Your input number is not in decimal point");
		//System.out.println(count);
		System.out.print("Digits before decimal points is ");
		for(y=0;y<count;y++)
			System.out.print(input.charAt(y));
		System.out.println();
		int x=0,check=5,t=0;
		System.out.print("Digits after decimal points is ");
		for(y=count+1;y<input.length();y++){
			System.out.print(input.charAt(y));
			x= (x*10) + input.charAt(y)-48;
		}
		System.out.println();
		//System.out.println(x);
		for(y=count+1;y<input.length();y++){
			if(x>check)
				t=0;
			if(x<check)
				t=1;
			if(x==check)
				t=2;
			check *=10;
		}

		if(t==0)
			System.out.println("Your number's fractional part is greater then 0.5 ");
		if(t==1)
			System.out.println("Your number's fractional part is less then 0.5 ");
		if(t==2)
			System.out.println("Your number's fractional part is equal then 0.5 ");

	}
}
