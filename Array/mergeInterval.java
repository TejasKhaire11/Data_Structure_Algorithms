
import java.util.*;
class mergeInterval{

    static List<List<Integer>>mergeIntervalProblem(int arr[][]){

        List<List<Integer>>ans=new ArrayList<>();

        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

        int n=arr.length;
        
            int start=arr[0][0];
            int end=arr[0][1];


        for(int i=0;i<n;i++){

            if(arr[i][0]<=end){
                end=Math.max(end, arr[i][1]);

            }
            else{

                ans.add(Arrays.asList(start,end));
                start=arr[i][0];
                end=arr[i][1];

                }

            }
          ans.add(Arrays.asList(start,end));

        return ans;

    }
public static void main(String[] args) {
    
    int arr[][]={{1,3},{2,6},{8,10},{10,15},{16,18},{16,17}};
    List<List<Integer>>result=mergeIntervalProblem(arr);
    System.out.println(result);

}



}