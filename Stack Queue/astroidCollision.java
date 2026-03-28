import java.util.*;

public class astroidCollision {
    
        public static  List<Integer>function(int arr[]){

           int n=arr.length;
           
          
            List<Integer>list=new ArrayList<>();
           
           for(int i=0;i<n;i++){

    
            while(!list.isEmpty() && arr[i]<0 && list.getLast()>0 && list.getLast()<Math.abs(arr[i])){

                list.removeLast();

            }
            if(!list.isEmpty() && arr[i]<0 && list.getLast()==Math.abs(arr[i])){

                list.removeLast();

            }
            else if(list.isEmpty() || list.getLast()<0 || arr[i]>0){

                list.add(arr[i]);

            }




           }

           return list;

  }


    public static void main(String[] args) {
        
int arr[]={4,7,1,1,2,-3,-7,17,15,-18,-19};

System.out.println(function(arr));


    }

}
