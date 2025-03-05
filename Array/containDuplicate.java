import java.util.*;

public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        boolean b1=false;
        
        System.out.println("Enter the Element of Array");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
           for(int j=i; j<n; j++){
               if(A[i]==A[j]){
                   b1=true;
               }
           }
        }
        System.out.print(b1);
    }
}