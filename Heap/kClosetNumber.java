
import java.util.*;
import java.util.Collections;
import java.util.PriorityQueue;

class pair{

    int val;
    int diff;

    pair(int diff,int val){
        this.val=val;
        this.diff=diff;
    }

}


public class kClosetNumber {
    
    public static void main(String[] args) {
        
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->b.diff-a.diff);

        List<Integer>ans=new ArrayList<>();

        int arr[]={5,6,7,8,9};
        int x=7;
        int k=3;
        for(int i=0;i<arr.length;i++){

            pq.add(new pair(Math.abs(arr[i]-x),arr[i]));

            if(pq.size()>k){

                pq.poll();
            }

        }
        while(!pq.isEmpty()){
            ans.add(pq.poll().val);
        }

        System.out.println(ans);

    }

}
