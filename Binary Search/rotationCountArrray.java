public class rotationCountArrray {

    static int countArrayRotate(int arr[],int n){

        int low=0;
        int high=n-1;
        int index=-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){

            int mid=(low+high)/2;

            if(arr[low]<=arr[mid]){

                if(arr[low]<min){
                    min=arr[low];
                    index=low;

                }
                low=mid+1;



            }
            else{

                if(arr[mid]<min){
                    min=arr[mid];
                    index=mid;
                }
                high=mid-1;


            }
            
        }

        return index;

    }
    public static void main(String[] args) {
        
        int arr[]={6,7,8,9,0,1,2,3,4,5};
        int n=arr.length;

        System.out.println(countArrayRotate(arr, n));


    }
}
