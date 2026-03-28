class lowerBound{

    static int function(int arr[],int target,int n){

    int low=0;
    int high=n-1;
    int ans=n;

    while(low<high){

int mid=(low+high)/2;

if(arr[mid]>=target){
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
    
    int arr[]={1,3,8,11,12,13,15,18,21};

   System.out.println( function(arr, 18, arr.length-1));
    }

}