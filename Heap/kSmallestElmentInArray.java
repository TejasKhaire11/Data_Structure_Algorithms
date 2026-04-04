
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class kSmallestElmentInArray {
        public static void main(String[] args) {

        int arr[]={7,2,10,4,1,20,15,8};
        int k=3;

        ArrayList<Integer>ans=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){

            pq.add(arr[i]);

            if(pq.size()>k){
                pq.remove();
            }
        
        }
        while(pq.size()>0){

            ans.add(pq.poll());
        }

        System.out.println("ans"+ans);
    }
    
    

}


