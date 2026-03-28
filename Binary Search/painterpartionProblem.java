import java.util.Arrays;

public class painterpartionProblem {
    
    
static int countstudent(int board[],int maxlen){

int painter=1;
int total=0;

for(int i=0;i<board.length;i++){


    if(total+board[i]<=maxlen){
        total+=board[i];
    }
    else{
        painter+=1;
        total=board[i];
    }
}


     return painter;
}

static int binarySearch(int board[],int k){

    int low=Arrays.stream(board).max().getAsInt();
    int high=Arrays.stream(board).sum();
    int ans=high;
    while(low<=high){

        int mid=(low+high)/2;

        int painter=countstudent(board,mid);

        if(painter<=k){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
    return ans;
}
    public static void main(String[] args) {
        
int arr[]={10,20,30,40};
int k=2;

System.out.println(binarySearch(arr, k));

    }
}


