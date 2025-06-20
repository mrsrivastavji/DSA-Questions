import java.util.*;

public class main{
    public static int calPow(int x,int n){
        if(n==0){
            return 1;
        }
        // return x*calPow(x,n-1);
        if(n%2==0){
            return calPow(x,n/2)*calPow(x,n/2);
        }
        else{
            return calPow(x,n/2)*calPow(x,n/2)*x;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of x: ");
        int x=sc.nextInt();
        if(x<=0){
            System.out.println("Enter valid value");
            System.out.print("Enter the value of x: ");
            x=sc.nextInt();
        }
        System.out.print(calPow(x,n));
    }
}
