
import java.util.*;

public class replaceElementByRank {
 
    static void replaceByRank(int arr[]){

        int copy[]=arr.clone();

        Arrays.sort(copy);

        HashMap<Integer,Integer>map=new HashMap<>();

        int rank=1;
        for(int i=0;i<copy.length;i++){

            if(!map.containsKey(copy[i])){
           
                map.put(copy[i], rank);
                rank++;

            }


        }

        for(int i=0;i<arr.length;i++){

            arr[i]=map.get(arr[i]);

        }

        for(int num:arr){
            System.out.print(num+" ");
        }
 

    }


    public static void main(String[] args) {
        
        int arr[]={10,50,60,30,10,90,80,10,30};

        replaceByRank(arr);

    

    }

}
