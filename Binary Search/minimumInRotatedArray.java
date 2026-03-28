class minimumInRotatedArray{

    static int minimumValue(int arr[],int n){

        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){

            int mid=(low+high)/2;

            if(arr[low]<=arr[mid]){

                min=Math.min(arr[low], min);
                low=mid+1;



            }
            else{

                min=Math.min(arr[mid], min);
                high=mid-1;


            }
            
        }

        return min;

    }

public static void main(String[] args) {
    
    int arr[]={7,8,9,2,3,4,5};
    int n=arr.length;


    System.out.println(minimumValue(arr, n));

}


}