import java.util.*;
class thirtyone
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four bit binary number");
		int n=sc.nextInt();
		int check=0,t=n;
		while(t>0){
			t=t/10;
			check++;
		}
		if(check!=4){
			System.out.println("Invalid Input");
			System.exit(0);
		}
		n=decimal(n);
		System.out.println("decimal number is " + n );
		t=octal(n);
		System.out.println("octal number is " + t );
		hexadecimal(n);
	}
	static int decimal(int a){
		int check=0,t;
		double n=0;
		while(a>0){
			t=a%10;
			n=n+(t*Math.pow(2,check) );
			a=a/10;
			check++;
		}
		return (int)n;
	}
	static int octal(int a){
		int arr[]=new int [10];
		int i,count=0;
		while(a>0){
			arr[count++]=a%8;
			a=a/8;
		}
		int n=0,t=1;
		for(i=count-1;i>=0;i--){
			n+=t*arr[i];
			t*=10;
		}
		return n;
	}
	static void hexadecimal(int a){
		int c[]=new int[10];
		int count=0;
		while(a>0){
			c[count++]=(a%16);
			a/=16;
		}
		System.out.print("hexadecimal number is ");
		for(a=count-1;a>=0;a--){
			System.out.print(c[a]);
		}
	}
}