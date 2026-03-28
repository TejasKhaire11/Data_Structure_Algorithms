class flowerBoqueProblem{

static boolean  possible(int arr[],int day,int m,int k){

    int count=0;
    int noOfBoque=0;

    for(int i=0;i<arr.length;i++){

        if(arr[i]<=day){
            count++;

        }
        else{
            noOfBoque+= (count/k);
            count=0;
        }
        
    }
    noOfBoque+=(count/k);
    return noOfBoque>=m;

}

static int roseInGarden(int arr[],int m,int k){

    int ans=-1;
    long val=m*k;
    if(val>arr.length) return -1;

    int mini=Integer.MAX_VALUE;
    int maxi=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        mini=Math.min(mini, arr[i]);
        maxi=Math.max(maxi, arr[i]);

    }
    int low=mini;
    int high=maxi;

    while(low<=high){
        int mid=(low+high)/2;

        if(possible(arr, mid, m, k)==true){
            ans= mid;
            high=mid-1;

        }
        else{
            low=mid+1;
        }

    }

return ans;

}



public static void main(String[] args) {
    

int arr[]={7,7,7,7,13,10,7,11};
int m=2;
int k=3;

System.out.println(roseInGarden(arr, m, k));

}


}