import java.util.*;


public class Main {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        return isSorted(arr,idx+1);
    }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the length of Array: ");
       int n=sc.nextInt();
       int Arr[]=new int[n];
       System.out.print("Enter the element of Array: ");
       for(int i=0; i<n; i++){
           Arr[i]=sc.nextInt();
       }
       
       System.out.print("Is the Array is strictlly increasing ?? ");
       System.out.print(isSorted(Arr,0));
    }
}
