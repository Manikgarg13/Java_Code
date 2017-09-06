import java.util.*;
class Five{
	public static void main(String ar[]){
		int t=1,evencount=0,even=0,odd=0,oddcount=0,input;
		while(t==1){
			Scanner s=new Scanner(System.in);
			System.out.println("Please :) enter a number ");
			input=s.nextInt();
			if(input<0)
				break;
			if(input%2==0){
				even=even+input;
				evencount++;
			}
			else{
				odd=odd+input;
				oddcount++;
			}
		}
		System.out.println("Average of odd numbers : "+ odd/oddcount);
		System.out.println("Average of even numbers : "+ even/evencount);
	}
}