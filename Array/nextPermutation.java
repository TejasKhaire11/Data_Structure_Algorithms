public class nextPermutation {
    
static void nextBiggerPermutation(int arr[]){

    int n=arr.length;

    int ind=-1;

    for(int i=n-2 ;i>=0;i--){

        if(arr[i]<arr[i+1]){
            ind=i;
            break;
        }
    }
    if(ind==-1){

    //reverse the array and stop;

    reverse(arr, 0, n-1);
    printArray(arr);
        return;

    }
    for(int i=n-1; i>ind;i--){

        if(arr[i]>arr[ind]){
            int temp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
            break;//only one swapping nedded here thats why brak apply 
        }

    }
    //revrse the remaing array in sorted 
    reverse(arr, ind+1, n-1);
    printArray(arr);
    }
static void reverse(int arr[],int l ,int r){

    while(l<r){

        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;

    }

}

static void printArray(int []arr){
    
    for(int num:arr){
        System.out.print(num+" ");
    }
}


    public static void main(String[] args) {
        
        int arr[]={2,1,5,4,3,0,0};
        nextBiggerPermutation(arr);

    }
}
