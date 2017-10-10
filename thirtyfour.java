import java.util.*;
class thirtyfour{
    public static void main(String ar[]){

        String s= "qwsdefwugvdcerihfawvbnehsttyuioplkjhgfdsazxugbcvblohnmnhtojhgdsvbfcde";
        int a[] = new int[26];
        int i,count,j=0,m;
         char c;
      //  char ch = char(count)
        for(j=0;j<26;j++){
            count=0;
            for(i=0;i<s.length();i++){
                c=s.charAt(i);
                m= (int) c;
                 // System.out.println(m);
                if(m==(j+97) )
                    count++;

            }
            a[j]=count;

        }

        for(i=0;i<26;i++)
            System.out.print("  " + a[i]);
        System.out.println();

    }
}
