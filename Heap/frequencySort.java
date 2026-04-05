import java.util.*;


public class frequencySort {
    
    public static void main(String[] args) {

        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);

        int arr[]={1,1,1,2,3,1,5,6,3,2,2};

        //put it into the MAP

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        // Put it into the heap
        for(Map.Entry<Integer, Integer>entry:map.entrySet()){

            pq.add(new int[]{entry.getValue(),entry.getKey()});

        }
        
        //loop throgh an heap

        while(!pq.isEmpty()){


            int []top=pq.poll();

            int frq=top[0];
            int value=top[1];
            

            for(int i =1;i<=frq;i++){

                ans.add(value);


            }
        
        }

        System.out.println(ans);




    }

}
