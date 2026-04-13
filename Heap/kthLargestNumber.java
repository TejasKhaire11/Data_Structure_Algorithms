
import java.util.*;

public class kthLargestNumber {
    
    PriorityQueue<Integer>lr;
    int k;
    public kthLargestNumber(int k,int []nums){

        this.k=k;
        lr=new PriorityQueue<>();

        for(int num:nums){
            lr.add(num);
        }
    }
   
        
    public int add(int val){
                
        lr.offer(val);
        
        if(lr.size()>k){

            lr.poll();

        }

        return lr.peek();
        }
    public static void main(String[] args) {
        
        int j=3;
        int nums[]={2,5,6,7,8,9,10};

        kthLargestNumber m=new kthLargestNumber(j, nums);
       System.out.println(m.add(15));
       System.out.println(m.add(7));
              System.out.println(m.add(8));
                     System.out.println(m.add(9));



    
    }
}
