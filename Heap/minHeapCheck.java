import java.util.*;
public class minHeapCheck {
 
    public static boolean isMinHeap(int arr[]){

        int n=arr.length;

        for(int i=0;i<n/2-1;i++){

            int left=2*i+1;
            int right=2*i+2;

            if(left<n && arr[i]>arr[left]){
                return false;
            }
            if(right<n && arr[i]>arr[right]){
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        

        int arr[]={2,4,5,19,6,10};
        if(isMinHeap(arr)){
            System.out.println("Given array is MinHeap");
        }
        else{
            System.out.println(" Given array is not in min heap format");
        }

    }

}
