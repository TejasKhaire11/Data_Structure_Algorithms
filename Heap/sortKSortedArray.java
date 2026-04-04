
import java.util.PriorityQueue;
import java.util.*;


public class sortKSortedArray {

    public static void main(String[] args) {
        int arr[]={1,6,4,8,5,7,9};
        int k=3;
        List<Integer>ans=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int i=0;i<=k;i++){
                pq.add(arr[i]);

        }
        for(int i=k+1;i<arr.length;i++){
            ans.add(pq.poll());
            pq.add(arr[i]);

        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        
        System.out.println(ans);
    }


}
