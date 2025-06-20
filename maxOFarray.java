import java.util.*;

public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        
        System.out.print("Enter the Element of Array: ");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        
        int max= Integer.MIN_VALUE;
        // Method 1
        // for(int l=0; l<n; l++){
        //     for(int i=0; i<n-l; i++){
        //         int B[]=new int[n];
        //         int sum=0;
        //         for(int j=l; j<n-i; j++){
        //             B[j]=A[j];
        //             sum+=A[j];
        //         }
        //         if(max<sum){
        //         max=sum;
        //         }
        //     }
        // }

        // Method 2
        // for(int l=0; l<n; l++){
        //     int sum=0;
        //     for(int j=l; j<n; j++){
        //         sum+=A[j];
        //         max=Math.max(max,sum);
        //     }
        // }

        // Method 3
        int sum=0;
        for(int j=0; j<n; j++){
            sum+=A[j];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Sum is: " + max);
    }
}
