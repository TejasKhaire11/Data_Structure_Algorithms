
public class SortArray012 {
    

static void sortArray(){
int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};
    int n=arr.length;
    int low=0,mid=0,high=n-1;

    while(mid<=high){

    if(arr[mid]==0){ 

    int temp=arr[mid];
    arr[mid]=arr[low];
    arr[low]=temp;

    mid++;
    low++;

    }
    else if(arr[mid]==1){

    mid++;

    }
    else{

    int temp=arr[high];
    arr[high]=arr[mid];
    arr[mid]=temp;


    high--;
    }
}
    
    printArray(arr);

}

static void printArray(int arr[]){

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}


    public static void main(String[] args) {
        
        sortArray();

    }
}
