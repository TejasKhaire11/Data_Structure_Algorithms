import java.util.Arrays;
import java.util.List;

// public class searchIn2DArray2 {
    
//     static List<Integer>function(int matrix[][],int target){
    
//         int n=matrix.length;

//         for(int i=0;i<n;i++){

//             int index=binarySearch(matrix[i], target);

//             if(index!=-1){
//                 return Arrays.asList(i,index);
//             }
            

//         }

//     return Arrays.asList(-1,-1);

        
//     }

//     static int binarySearch(int matrix[],int target){

//         int low=0;
//         int high=matrix.length;

//         while(low<=high){

//             int mid=(low+high)/2;

//             if(matrix[mid]==target){
//                 return mid;
//             }
//             else if(matrix[mid]>target){
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }

//         }

//         return -1;
//     }



//     public static void main(String[] args) {
        
        // int matrix[][]={

        //     {1,4,7,10,15},
        //     {2,5,8,12,19},
        //     {3,6,9,16,22}
        //     ,{11,13,14,17,24},
        //     {18,21,23,26,30}

        // };

        // int target=14;

        // System.out.println(function(matrix, target));


//     }
// }

class searchIn2DArray2{

    static List<Integer>function(int matrix[][],int target){

        int n=matrix.length;
        int m=matrix[0].length;
        int row=0;
        int col=m-1;

        while(row<n && col>=0){

            if(matrix[row][col]==target){
                return Arrays.asList(row,col);
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }

        }



        return Arrays.asList(-1,-1);

    }




public static void main(String[] args) {
    

        int matrix[][]={

            {1,4,7,10,15},
            {2,5,8,12,19},
            {3,6,9,16,22}
            ,{11,13,14,17,24},
            {18,21,23,26,30}

        };

        int target=18 ;

        System.out.println(function(matrix, target));



}


}