import java.util.*;

public class main{
    public static void printRev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str,idx-1);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        printRev(str,str.length()-1);
    }
}
