import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Nine{
	private static final String FILENAME = "E:\\Java_Code\\Nine.txt";
	public static void main(String ar[]){


		BufferedReader br = null;
		FileReader fr = null;
		int a=0,i,countA=0,countB=0,countC=0,countD=0,countF=0,totalstudents=0;
		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String sCurrentLine;

			char ch;
				while ((sCurrentLine = br.readLine()) != null) {
					totalstudents++;
					i=sCurrentLine.length();
					int j=0;
					a=0;
					while(j<i){
						a*=10;
						ch=sCurrentLine.charAt(j);
						a+= ((int)ch - 48);
						j++;
					}

					if(a>=90)
						countA++;
					else if(a>=80 && a<90)
						countB++;
					else  if(a>=65 && a<80)
						countC++;
					else  if(a>=50 && a<65)
						countD++;
					else if(a<50)
						countF++;
				}
		} catch (IOException e) {
				e.printStackTrace();
		}

		System.out.println("The number of students who received A grades are "+countA);
		System.out.println("The number of students who received B grades are "+countB);
		System.out.println("The number of students who received C grades are "+countC);
		System.out.println("The number of students who received D grades are "+countD);
		System.out.println("The number of students who received F grades are "+countF);
		System.out.println("The number of total students are "+totalstudents);
		double A,B,C,D,F;
		A=(countA*100)/totalstudents;
		B=(countB*100)/totalstudents;
		C=(countC*100)/totalstudents;
		D=(countD*100)/totalstudents;
		F=(countF*100)/totalstudents;
		System.out.println("The percentage of students receiving A  grade are "+A +"%");
		System.out.println("The percentage of students receiving B  grade are "+B+"%");
		System.out.println("The percentage of students receiving C  grade are "+C+"%");
		System.out.println("The percentage of students receiving D  grade are "+D+"%");
		System.out.println("The percentage of students receiving F  grade are "+F+"%");
	}
}