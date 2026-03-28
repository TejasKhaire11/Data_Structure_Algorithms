public class rotateElementByDplaces {
  static void reverse(int arr[], int start,int end){

    while (start<end) { 
        
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;


    }

  }
  static void leftRotate(int arr[],int d){

    int n=arr.length;
     d= d % n;

     reverse(arr,0,d-1);

     reverse(arr, d, n-1);

     reverse(arr, 0, n-1);

  }

  static void print(int arr[]){

    for(int num:arr){
        System.out.print(num+" ");
    }

  }

    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,5,6,7};
        int d=3;
        leftRotate(nums, d);
        print(nums);
    }
}
