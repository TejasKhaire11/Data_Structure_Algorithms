import java.util.Arrays;

public class divisorProblem {
    
    static int findDivisor(int arr[],int mid){

       int  sum=0;
        for(int i=0;i<arr.length;i++){

            sum+=Math.ceil((double)arr[i]/mid);
        
        }

return sum;

    }

    static int returnDivisor(int arr[],int threshold){

        int low=1;
        int high=Arrays.stream(arr).max().getAsInt();

        int ans=-1;
        while(low<=high){

            int mid=(low+high)/2;

            if(findDivisor(arr, mid)<=threshold){
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
        
int arr[]={1,3,5,9};
int threshold=6;
System.out.println("Minimu divisor is: "+returnDivisor(arr, threshold));

    }
}
