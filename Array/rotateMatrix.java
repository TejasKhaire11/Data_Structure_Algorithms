import java.lang.reflect.Array;
import java.util.Arrays;

// public class rotateMatrix {
    
//     static int[][] rotateMatrix90(int matrix[][]){

//          int n=matrix.length;
//         int arr[][]=new int[n][n];
       
//         for(int i=0;i<matrix.length;i++){

//             for(int j=0;j<matrix.length;j++){

//                 arr[j][n-1-i]=matrix[i][j];
//             }

//         }


// return arr;
//     }

//     public static void main(String[] args) {
        
//         int matrix[][]={

//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}

//         };
//         System.out.print(Arrays.deepToString(rotateMatrix90(matrix)));
//     }
// }


public class rotateMatrix {

    static int[][]rotateMatrix90(int matrix[][]){

        int n=matrix.length;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i]; 
                 matrix[j][i]=temp; 

            }
        }


        //rever each row
       for(int i=0;i<n-1;i++){
        int r=matrix[i].length-1;
        int l=0;
        while(l<r){

            int temp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=temp;
            l++;
            r--;
        }

       } 
        
        return matrix;
    }

     public static void main(String[] args) {
        
        int matrix[][]={

            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}

        };
        System.out.print(Arrays.deepToString(rotateMatrix90(matrix)));

}


    }