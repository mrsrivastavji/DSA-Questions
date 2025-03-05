import java.util.*;

public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        
        System.out.println("Enter the Element of Array");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            if(A[i]>max){
                max=A[i];
            }
            else if(A[i]<min){
                min=A[i];
            }
            else{
                continue;
            }
        }
        System.out.println("Maximum number is "+ max);
        System.out.println("Minimum number is "+ min);
    }
}