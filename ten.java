import java.text.*;

class ten
{
	public static void main(String [] args)
	{
		double principle = 525000.00, interest_amt , amt=0.0; int years = 10;

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.print("\n\nYear \t  Opening balance \t  Interest(@8.5%)\t  Amount\n");
		for(int i=1;i<=years;i++)
		{
			interest_amt = ((8.5/100) * principle);
			amt = principle + interest_amt;
			System.out.print(i+"\t  "+df.format(principle)+"\t\t  "+df.format(interest_amt)+"\t\t  "+df.format(amt)+"\n");
			principle = amt;
		}
		System.out.print("\n\nAmount you recieve at the end of 10 years : "+df.format(amt)+"\n\n");


	}
}