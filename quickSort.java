import java.util.*;

public class main{
    public static int partition(int arr[],int low, int high){
        int pivot=arr[high];
        int i=low-1;
        
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
        
    }
    public static void main(String args[]){
        int Arr[]={6,3,9,5,2,7};
        int n=Arr.length;
        quickSort(Arr,0,n-1);
        
        System.out.print("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
