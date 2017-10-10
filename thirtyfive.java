import java.util.*;
class thirtyfive{
    public static void main(String ar[]){

        String s= "75439753092765489190547814692984638544009852136754709814903";
        int a[] = new int[10];
        int i,count,j=0,m;
         char c;

        for(j=0;j<10;j++){
            count=0;
            for(i=0;i<s.length();i++){
                c=s.charAt(i);
                m= (int) c;
                 // System.out.println(m);
                if(m==(j+48))
                    count++;
            }
            a[j]=count;
        }
		count=0;
        for(i=0;i<10;i++){
            System.out.print("  " + a[i]);
            count+=a[i];
		}
		System.out.println();
        System.out.println("Sum of digits from this populated array for int's :" + count);


    }
}
