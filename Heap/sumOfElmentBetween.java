
import java.util.*;
public class sumOfElmentBetween {

   
      static int firstValue(int []arr,int k1){

        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){

            pq.add(arr[i]);

            if(pq.size()>k1) pq.poll();
        }

        return pq.poll();
      }

        static int SecondValue(int []arr,int k2){

        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){

            pq.add(arr[i]);

            if(pq.size()>k2) pq.poll();
        }

        return pq.poll();
      }
      static int finalComputation(int arr[],int first,int second){

        int ans=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>first && arr[i]<second){
                ans=ans+arr[i];
            }
        }

        return ans;
      }

 public static void main(String[] args) {
        
       int arr[]={1,3,5,11,12,15};
       
       int k1=3;
       int k2=6;

       int first=firstValue(arr, k1);
       int second=SecondValue(arr, k2);

       int result=finalComputation(arr,first,second);

       System.out.println("final answer;"+result);

    }

}
