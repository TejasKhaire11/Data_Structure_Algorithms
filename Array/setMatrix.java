
import java.util.Arrays;
//Better Solution 
// public class setMatrix {
    
//     static int[][] matrixConvertZero(int arr[][]){

//         int n=arr.length;
//         int m=arr.length;

//         int col[]=new int[m];
//         int row[]=new int[n];

//         for(int i=0;i<n;i++){

//             for(int j=0;j<m;j++){

//                 if(arr[i][j]==0){
//                     row[i]=1;
//                     col[j]=1;
//                 }
//             }
//         }
//         for(int i=0;i<n ;i++){
//             for(int j=0;j<m;j++){
//                 if(row[i]==1 || col[j]==1){
//                     arr[i][j]=0;
//                 }
//             }
//         }

//         return arr;
//     }
//     public static void main(String[] args) {
//     int matrix[][]={

//         {1,1,1,1},
//         {1,0,1,0},
//         {1,1,0,1}
//         ,{1,1,1,1}

//     };    
  
//     System.out.println(Arrays.deepToString(matrixConvertZero(matrix)));


//     }
// }

//optimal Just Reduce the space complexity::


public class setMatrix {

static int[][]matrixConvertZero(int arr[][]){

    int col0=1;
     int n=arr.length;
     int m=arr.length;

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){

            if(arr[i][j]==0){

                arr[i][0]=0;

                if(j!=0){
                    arr[0][j]=0;
                }else{
                    col0=0;
                }

            }

        }
    }

    for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){

            if(arr[i][j]!=0){

                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }

            }
        }
    }

    if(arr[0][0]==0){
        for(int j=0;j<m;j++){
            arr[0][j]=0;
        }
    }
    if(col0==0){
        for(int i=0;i<n;i++){
            arr[i][0]=0;
        }
    }

return arr;


}

public static void main(String[] args) {
    int matrix[][]={

        {1,1,1,1},
        {1,0,1,0},
        {1,1,0,1}
        ,{1,1,1,1}

    };    
  
    System.out.println(Arrays.deepToString(matrixConvertZero(matrix)));


    }
}



