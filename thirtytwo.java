import java.util.*;
class thirtytwo{
    
    public static void main(String ar[]){
        Scanner S= new Scanner(System.in);
        System.out.println("Please enter a string");
        String str=S.nextLine();
        Split s= new Split();
        s.spliter(str);
        System.out.println("Your  string contain first part as: "+  s.first);
        System.out.println("Your  string contain second part as: "+  s.second);
    
    }    
}

class Split{
    static String first, second;
    static Split spliter(String x){
        int i,count=0;
        Split sp= new Split();
        if( (x.length()) % 2 != 0)
        {
            System.out.println("Sorry! :( I cant accept your string");
            System.exit(0);
        }
        
//        for(i=0;i<x.length()/2;i++)
        sp.first=x.substring(0, (x.length()/2) );
        sp.second=x.substring( (x.length()/2), x.length() );
//        System.out.println( first +"  " + second);
           return sp;               
    
    }
}
