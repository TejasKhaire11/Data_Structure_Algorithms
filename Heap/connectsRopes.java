
import java.util.PriorityQueue;


public class connectsRopes {
    
    public static void main(String[] args) {
        
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    
    int arr[]={1,2,3,4,5,6};

    int totalSum=0;
    for(int i=0;i<arr.length;i++){
        pq.add(arr[i]);
    }

    while(pq.size()>1){

        int first=pq.poll();
        int second=pq.poll();

        totalSum=totalSum+first+second;

        pq.add(first+second);


    }
    System.out.println("answer:"+totalSum);
            

    }
}
