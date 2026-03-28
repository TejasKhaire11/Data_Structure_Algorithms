public class searchRotatedArrayWithDuplicate {
    

    static boolean  rotatedArray(int arr[],int n ,int target){

        int low=0;
        int high=n-1;
        
        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid]==target) return true;

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }

            if(arr[low]<=arr[mid]){

                if(arr[low]<=target && target<=arr[mid]){

                    high=mid-1;

                }else{

                    low=mid+1;
                }

            }else{

                if(arr[mid]<=target && target<=arr[high]){

                    low=mid+1;

                }
                else{
                    high=mid-1;
                }



            }


        }

        return false;

    }

    public static void main(String[] args) {
        
        int arr[]={7,9,9,1,2,3,3,3,4,5,6};
        int target=3;
        int n=arr.length;
        System.out.println(rotatedArray(arr, n, target));

    }

}



