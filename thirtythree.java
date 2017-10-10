import java.util.*;
class thirtythree{
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a int");
        int a=sc.nextInt();
        Split s= new Split(a);
		s.splitter(a);
        System.out.println("Your  int contain first part as: "+  s.first);
        System.out.println("Your  int contain second part as: "+  s.second);

    }
}

class Split{
    int first, second=0, i=1,count=0,t=0,j;
	int a[]=new int [100];
    public Split(int x){
		while(x>0){
			x=x/10;
			count++;
		}
		if( count % 2 != 0 || count>8 )
		{
			System.out.println("Sorry! :( I cant accept your integer");
			System.exit(0);
		}
	}
	public void splitter(int x){
		while(t!=count/2){
			a[t++]=x%10;
			x/=10;
		}
		for(j=0;j<t;j++){
			second=second+ (i*a[j]);
			i*=10;
		}
		first=x;
	}

}
