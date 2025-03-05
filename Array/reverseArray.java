import java.util.*;

public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        int B[]=new int[n];
        
        System.out.println("Enter the Element of Array");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        
        
        int j=0;
        for(int i=n-1; i>-1; i--){
            B[j]=A[i];
            j+=1;
        }
        System.out.println("Element of Array B");
        for(int i=0; i<n; i++){
           System.out.println(B[i]);
        }
    }
}