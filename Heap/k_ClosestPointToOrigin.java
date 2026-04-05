
import java.util.*;

public class k_ClosestPointToOrigin {
    
    public static void main(String[] args) {
        
    int arr[][]={

        {0,1},{1,3},{5,8},{2,-2},{5,9}

    };                

    int k=2;

    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);

    for(int i=0;i<arr.length;i++){

        int x=arr[i][0];
        int y=arr[i][1];

        int val=x*x+y*y;

        pq.add(new int[]{val,x,y});

        if(pq.size()>k){
            pq.poll();
        }

    }
    while(!pq.isEmpty()){

        int []point=pq.poll();
        System.out.println(point[1]+" "+point[2]);

    }



    }

}
