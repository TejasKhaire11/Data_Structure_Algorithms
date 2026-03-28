import java.util.Arrays;

public class kokoEatingBanana {
    
    static int bananaKoko(int arr[],int h)
{   int n=arr.length;
    int low=1;
    int high=Arrays.stream(arr).max().getAsInt();
    int ans=Integer.MAX_VALUE;

    while(low<=high){
        int mid=(low+high)/2;

        int totalHour=function(arr,mid);
        if(totalHour<=h){
            
            ans=mid;
            high=mid-1;

        }
        else{
            low=mid+1;
        }

    }
    return ans;
}
static int function(int arr[],int hourly){
    int n=arr.length;

    int totalhr=0;
    for(int i=0;i<n;i++){

     totalhr+=Math.ceil((double)arr[i]/(double)hourly);
   
    }
    return totalhr;

}
    public static void main(String[] args) {
        
        int arr[]={3,11,7,6};
        int h=8;
        System.out.println(bananaKoko(arr, h));


    }
}
