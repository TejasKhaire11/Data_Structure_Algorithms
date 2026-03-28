import java.util.Arrays;

public class shipProblemCapcity {
    
    

    static int sheepCapacity(int arr[],int mid){
            int load=0;
            int days=1;

        for(int i=0;i<arr.length;i++){

           if(load+arr[i]>mid){
            
            days+=1;
            load=arr[i];
           }
           else{

            load=load+arr[i];
           }

        }

        return days;
    }

    static int binaryAlgo(int arr[], int days){

        int low=Arrays.stream(arr).max().getAsInt();
        int high=Arrays.stream(arr).sum();
        // System.out.println(high);
        int ans=0;

      
        while(low<=high){

            int mid=(low+high)/2;

            int numOfDays=sheepCapacity(arr, mid);

            if(numOfDays<=days){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }


        }
        return ans;

    }


    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(binaryAlgo(arr, days));

    }
}
