public class rowWithMinimumNumberOfOnce {
    

    static int binarySearch(int arr[],int x){

        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high){

            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }

        }
        return ans;


    }

    static int findIndexValue(int matrix[][],int n,int m){

        int maxCount=0;
        int index=-1;

        for(int i=0;i<n;i++){

            int countOfOnce=m-binarySearch(matrix[i], 1);

            if(countOfOnce>maxCount){
                maxCount=countOfOnce;
                index=i;
            }

        }




        return index;
    }



    public static void main(String[] args) {
        
        int matrix[][]={
            {0,0,0,1,1},
            {0,0,1,1,1},
            {0,1,1,1,1},
            {1,1,1,1,1},
            {0,1,1,1,1}
    
    };
    int m=matrix[1].length;
    int n=matrix.length;

    int reseult=findIndexValue(matrix,n,m);
    System.out.println(reseult);
}

}