import java.util.Arrays;

public class bookAllocationProblem {
    
static int countstudent(int arr[],int pages){

int student=1;
int pagesStudent=0;

for(int i=0;i<arr.length;i++){


    if(pagesStudent+arr[i]<=pages){
        pagesStudent+=arr[i];
    }
    else{
        student+=1;
        pagesStudent=arr[i];
    }
}


     return student;
}

static int binarySearch(int arr[],int m){

    int low=Arrays.stream(arr).max().getAsInt();
    int high=Arrays.stream(arr).sum();
    int ans=-1;
    while(low<=high){

        int mid=(low+high)/2;

        int student=countstudent(arr,mid);

        if(student<=m){
            high=mid-1;
            ans=mid;
        }else{
            low=mid+1;
        }
    }
    return ans;
}




    public static void main(String[] args) {
        
int arr[]={25,46,28,49,24};
int m=4;

System.out.println(binarySearch(arr, m));

    }
}
