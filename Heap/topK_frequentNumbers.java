
import java.util.*;

public class topK_frequentNumbers {

    public static void main(String[] args) {
        
    List<Integer>ans=new ArrayList<>();
    
    HashMap<Integer,Integer>map=new HashMap<>();

    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

    int arr[]={1,2,3,5,5,2,1,1,3,2,8,3,1};

    int k=3;

    for(int i=0;i<arr.length;i++){

        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

    }
    
    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        pq.add(new int[]{entry.getValue(),entry.getKey()});

        if(pq.size()>k){
            pq.poll();
        }
    }

    while(!pq.isEmpty()){

        ans.add(pq.poll()[1]);
    }
    System.out.println(ans);
}


}