import java.util.*;

class MinHeap{

    ArrayList<Integer>heap;

    public  MinHeap() {
    
        heap=new ArrayList<>();
   
    }

    
    //insert opertion into the heap


    public  void insertIntoHeap(int val){

        heap.add(val);
        heapifyUp(heap.size()-1);
        
    }

    //HeapefyUP After insreting a value

    public  void heapifyUp(int i){

        while(i>0){

            int parent=(i-1)/2;

            if(heap.get(parent)>heap.get(i)){

                swap(i,parent);
                i=parent;

            }
            else{
                break;
            }
        }
    }

    public void swap(int i,int j){

        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);

    }
    //Extracting value from Heap

    public  int extractMin(){

        if(heap.size()==0) return -1;


        int min=heap.get(0);

        int last=heap.remove(heap.size()-1);

        if(heap.size()>0){
        heap.set(0, last);
        heapefyDown(0);     
        }
        return min;
    }

    //Heapify Down

    public  void heapefyDown(int i){

        int smallest=i;

        int left=2*i+1;
        int right=2*i+2;

        if(left<heap.size() && heap.get(left)<heap.get(smallest)){
            smallest=left;
        }

        if(right<heap.size() && heap.get(right)<heap.get(smallest)){
            smallest=right;

        }

        if(smallest!=i){
            swap(i, smallest);
            heapefyDown(smallest);
        }


    } 
}

public class implmentationOfMinHeap {
    public static void main(String[] args) {
        
        MinHeap h=new MinHeap();

        h.insertIntoHeap(10);
        h.insertIntoHeap(20);
        h.insertIntoHeap(3);
        h.insertIntoHeap(4);
        h.insertIntoHeap(6);
     System.out.println(h.extractMin());  
     System.out.println(h.extractMin());
        

      

    }

}
