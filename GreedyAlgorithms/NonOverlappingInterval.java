import java.util.*;
public class NonOverlappingInterval {
    

    static int NonOverlap(int mat[][],int n){

        Arrays.sort(mat,(a,b)->a[1]-b[1]);

        int count=1;
        int lastEndTime=mat[0][1];

        for(int i=0;i<n;i++){

            if(mat[i][0]>=lastEndTime){

                count=count+1;
                lastEndTime=mat[i][1];
            }

        }
        return count;
    }

    
    public static void main(String[] args) {
        
        int mat[][]={
              {1,2},
                {2,3},
                {3,4},
                {1,3}
        };

        int n = mat.length;
        System.out.println(NonOverlap(mat,n));


    }



}
