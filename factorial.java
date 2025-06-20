import java.util.*;

public class main{
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("The factorial is: "+ fact(n));
    }
}
