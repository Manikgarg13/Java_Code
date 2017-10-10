import java.util.*;
class twentynine
{
	  public static void main(String args[])
	  {
			int i,n; double sum=0; char c;
			String s="";
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter an hexadecimal number");
			s=ob.nextLine();
			int len=s.length();
			if(len>5){
				System.out.println("Length is greater than 5");
				System.exit(0);
			}
			for(i=0;i<len;i++){
				if( (s.charAt(i)=='0') ||(s.charAt(i)=='1' || (s.charAt(i)=='2') || (s.charAt(i)=='3') || (s.charAt(i)=='4') || (s.charAt(i)=='5') || (s.charAt(i)=='6') || (s.charAt(i)=='7')|| (s.charAt(i)=='8') || (s.charAt(i)=='9')|| (s.charAt(i)=='A')|| (s.charAt(i)=='B')|| (s.charAt(i)=='C') || (s.charAt(i)=='D') || (s.charAt(i)=='E') || (s.charAt(i)=='F')) ){
				}else{
					System.out.println("It is not an hexadecimal number");
					System.exit(0);
				}
			}
			int temp=len-1;
			for(i=0;i<len;i++)
			{
				  c=s.charAt(i);
				  n=(int)c-48;
				  if( (c=='A') || (c=='B') || (c=='C') || (c=='D') || (c=='E') || (c=='F'))
					  n=(int)c-55;
				  sum=sum+n*Math.pow(16,temp);
				  temp--;
			}
			System.out.println("Decimal conversion is:"+sum);
	  }
}
