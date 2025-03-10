import java.util.*;

public class main{
    public static void fibo(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c);
        fibo(b,c,n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a);
        System.out.print(b);
        fibo(a,b,n-2);
    }
}