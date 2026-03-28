
import java.util.ArrayList;


public class spiralMatrix {
 

static void matrix(int mat[][]){

ArrayList<Integer>ans=new ArrayList<>();

int n=mat.length;
System.out.println(n);
int m=mat[0].length;

int left=0 , top=0;
int bottom=n-1 ,right=m-1;

while(left<=right && top<=bottom){

    for(int i=left ;i<=right;i++){
        ans.add(mat[top][i]);
    }
    top++;
    for(int i=top;i<=bottom;i++){
        ans.add(mat[i][right]);
    }
    right--;

    if(top<=bottom){
        for(int i=right;i>=left;i--){
            ans.add(mat[bottom][i]);
        }
        bottom--;
    }
    if(left<=right){
        for(int i=bottom;i>=top;i--){
            ans.add(mat[i][left]);
        }
        left++;
    }

}
System.out.println(ans);

}

    public static void main(String[] args) {
        
        int mat[][]={

            {1,2,3,4,5,6},
            {12,11,10,9,8,7},
            {13,14,15,16,17,18},
            {19,20,21,22,23,24},
            {26,27,28,29,30,31},
            {32,33,34,35,36,111}

        };

       spiralMatrix.matrix(mat);


    
    }
}
