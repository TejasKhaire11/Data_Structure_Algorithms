import java.util.*;

public class findMedianOfDataStream {

PriorityQueue<Integer>left;

PriorityQueue<Integer>right;


    public findMedianOfDataStream() {
    
        left=new PriorityQueue<>(Collections.reverseOrder());
        right=new PriorityQueue<>();
    
    }

    public void addNum(int num){

        left.add(num);


        right.add(left.poll());


        if(right.size()>left.size()){

            left.add(right.poll());
        }
    
    }

    public double findMedian(){

        if(left.size()==right.size()){
            double ans=(left.peek()+right.peek())/2.0;
            
            return ans;
        }
        else{   

            return left.peek();

        }
    }

    public static void main(String[] args) {
        
findMedianOfDataStream obj=new findMedianOfDataStream();

    obj.addNum(1);
  System.out.println(obj.findMedian());

    obj.addNum(2);
    System.out.println(obj.findMedian());
    obj.addNum(3);
        System.out.println(obj.findMedian());
    obj.addNum(4);
        System.out.println(obj.findMedian());


    }
}
