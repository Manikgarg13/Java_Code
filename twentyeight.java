import java.util.*;
class twentyeight
{
	  public static void main(String args[])
	  {
			int i,n; double sum=0; char c;
			String s="";
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter an octal number");
			s=ob.nextLine();
			int len=s.length();
			if(len>5){
				System.out.println("Length is greater than 5");
				System.exit(0);
			}
			for(i=0;i<len;i++){
				if( (s.charAt(i)=='0') ||(s.charAt(i)=='1') || (s.charAt(i)=='2') || (s.charAt(i)=='3') || (s.charAt(i)=='4') || (s.charAt(i)=='5') || (s.charAt(i)=='6') || (s.charAt(i)=='7') ){
				}else{
					System.out.println("It is not an octal number");
					System.exit(0);
				}
			}
			int temp=len-1;
			for(i=0;i<len;i++)
			{
				  c=s.charAt(i);
				  n=(int)c-48;
				  sum=sum+n*Math.pow(8,temp);
				  temp--;
			}
			System.out.println("Decimal conversion is:"+sum);
	  }
}
