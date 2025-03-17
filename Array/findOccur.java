import java.util.*;

public class main{
    public static int first=-1;
    public static int last=-1;
    
     public static void find(String str,int idx,char element){
         if(idx==str.length()){
            System.out.println("First occurance: "+first);
            System.out.println("Last occurance: "+last);
            return;
         }
         char currChar=str.charAt(idx);
         if(currChar==element){
             if(first==-1){
                 first=idx;
             }
             else{
                 last=idx;
             }
         }
         find(str,idx+1,element);
     }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        System.out.print("Enter the element: ");
        char ele=sc.next().charAt(0);
        find(str,0,ele);
    }
}