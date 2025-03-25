import java.util.*;

public class main{
    public static void conquer(int arr[],int s1,int mid,int e1){
        int merg[]=new int[e1-s1+1];
        int idx1=s1;
        int idx2=mid+1;
        int x=0;
        
        while(idx1 <= mid && idx2 <= e1){
            if(arr[idx1] <= arr[idx2]){
                merg[x++] = arr[idx1++];
            }
            else{
                merg[x++] = arr[idx2++];
            }
        }
        
        while(idx1 <= mid){
            merg[x++] = arr[idx1++];
        }
        
         while(idx2 <= e1){
             merg[x++] = arr[idx2++];
         }
         
         for(int i=0,j=s1; i<merg.length; i++,j++){
             arr[j]=merg[i];
         }
    }
    public static void divide(int arr[],int s1, int e1){
        if(s1>=e1){
            return;
        }
        int mid=s1+(e1-s1)/2;
        divide(arr,s1,mid);
        divide(arr,mid+1,e1);
        conquer(arr,s1,mid,e1);
    }
    public static void main(String args[]){
        int Arr[]={6,3,9,5,2,8};
        int n=Arr.length;
        divide(Arr,0,n-1);
        
        System.out.print("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}