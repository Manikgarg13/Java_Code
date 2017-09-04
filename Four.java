import java.util.*;
class Four{
	public static void main(String []ar){
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		int y,count=0;
		for(y=0;y<input.length();y++){
			if(input.charAt(y)=='.')
				count=y;
		}
		if(count==0)
			System.out.println("Your input number is not in decimal point");
	}
}
