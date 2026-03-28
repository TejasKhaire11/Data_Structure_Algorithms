
import java.util.Arrays;
import  java.util.List;

public class peakElementInMatrix {
   
    static int function(int matrix[][],int col,int n){
    int maxValue=-1;
    int index=-1;
    for(int i=0;i<n;i++){

        if(matrix[i][col]>maxValue){
            maxValue=matrix[i][col];

            index=i;
        }


    }

    return index;

    }
static List<Integer>BinarySearch(int matrix[][]){

    int low=0;
    int high=matrix.length;
    int n=matrix.length;

    while(low<=high){

        int mid=(low+high)/2;

        int maxRowValue=function(matrix,mid,n);


        int left=mid-1>=0 ? matrix[maxRowValue][mid-1]:-1;

        int right=mid+1<n ? matrix[maxRowValue][mid+1]:-1;

        if(matrix[maxRowValue][mid]>left && matrix[maxRowValue][mid]>right){
            return Arrays.asList(maxRowValue,mid);
        }
        else if(matrix[maxRowValue][mid]<left){
            high=mid-1;
        }
        else{
            low=mid+1;
        }

    }




    return Arrays.asList(-1,-1);
}



    public static void main(String[] args) {
        

        int matrix[][]={
            {2,2,5,1,4,5},
            {2,3,3,2,3,2},
            {1,3,16,0, 1,3},
            {3,6,2,6,7,2}

        };
        System.out.println(BinarySearch(matrix));

    }
}
