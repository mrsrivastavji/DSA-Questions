import java.util.*;

public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        int sum=0;
        
        System.out.println("Enter the Element of Array");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }

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
        for(int l=0; l<n; l++){
            for(int i=0; i<n-l; i++){
                int B[]=new int[n];
                int sum=0;
                for(int j=l; j<n-i; j++){
                    B[j]=A[j];
                    sum+=A[j];
                }
            //  System.out.println("Element of Array ");
            //  for(int k=0; k<n; k++){
            //      System.out.print(B[k]+" ");
            //  }
            //  System.out.println("Sum is: " + sum);
            
                if(max<sum){
                max=sum;
                }
            }
        }
        System.out.println("Sum is: " + max);
        }
    }
    }
}