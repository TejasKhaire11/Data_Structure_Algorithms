import java.util.*;
public class minHeapToMaxHeap {
    
    public static void maxHeap(int arr[],int n,int i){

        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){

            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            maxHeap(arr, n, largest);

        }

    }
    public static void convertMinToMaxHeap(int arr[],int n){
        for(int i=(n/2)-1;i>=0;i--){
            maxHeap(arr, n, i);
        }
    }
    public static void main(String[] args) {
        
int arr[]={1,3,5,7,9,2};
int n=arr.length;

convertMinToMaxHeap(arr, n);

for(int num:arr){
    System.out.print(num+" ");
}



    }

}
