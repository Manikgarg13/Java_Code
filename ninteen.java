//Nice One :)
import java.util.*;
class ninteen{

	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		check(str);
	}

	static void check(String a){
			int i=a.length(),t=0,j,count=0,check=0;
			char b;
			char c[]= new char [i] ;
			int arr[]=new int [i];
			for(t=0;t<i;t++)
				c[t]=a.charAt(t);
			for(t=0;t<i;t++){
				count++;
				j=(int)c[t];
				if(j==32){
					count--;
					arr[check++]=count;
					count=0;
				}
			}
			arr[check++]=count;

		//	for(t=0;t<check;t++)
		//		System.out.println(arr[t]);
			int large=0,index=0;
			for(t=0;t<check;t++){
				if(arr[t]>=large){
					large=arr[t];
					index=t;
				}
			}
			//System.out.println(large+" "+index);
			count=0;check=0;
			for(t=0;t<i;t++){
				j=(int)c[t];
				if(j==32){
					count++;
					if((count-1)==index)
						break;
				}
				check++;
			}

			for(t=check-large;t<check;t++){
				System.out.print(c[t]);
			}
			System.out.println();
	}
}