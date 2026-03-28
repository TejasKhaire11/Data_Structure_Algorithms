class findSqurtNumber{

static int squrtnumber(int arr[],int n){

int ans=0;
int low=0;
int high=arr.length-1;

while(low<=high){

    int mid=(low+high)/2;

    if(arr[mid]*arr[mid]<=n){

        ans=arr[mid];
        low=mid+1;
    }
    else{
        high=mid-1;
    }

}
    return ans;
}




public static void main(String[] args){

    int arr[]={1,2,3,4,5,6,7,8,9};

    int n=37;

    System.out.println(squrtnumber(arr, n));


}


}