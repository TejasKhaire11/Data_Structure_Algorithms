import java.util.*;
public class mergeK_sortedList {
    static class LinkedList{

    int val;
    LinkedList next;

    public LinkedList(int val) {
    
        this.val=val;
        this.next=null;        
    }

}
    
    public LinkedList mergeLists(LinkedList []lists){

        PriorityQueue<LinkedList>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        
        for(LinkedList head:lists){
            if(head!=null){
                pq.add(head);
            }
        }

        LinkedList dummyNode =new LinkedList(-1);
        LinkedList current=dummyNode; 


        while(!pq.isEmpty()){

            LinkedList smaller=pq.poll();

            current.next=smaller;
            current=current.next;

            if(smaller.next!=null){
                pq.add(smaller.next);

            }

        }
        return dummyNode.next;

    }
      public static LinkedList createList(int[] arr) {
        LinkedList dummy = new LinkedList(-1);
        LinkedList current = dummy;

        for (int num : arr) {
            current.next = new LinkedList(num);
            current = current.next;
        }

        return dummy.next;
    }
       public static void printList(LinkedList head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // 🔥 MAIN METHOD
    public static void main(String[] args) {

        mergeK_sortedList obj = new mergeK_sortedList();

        // Step 1: Create individual linked lists
        LinkedList l1 = createList(new int[]{1, 4, 5});
        LinkedList l2 = createList(new int[]{1, 3, 4});
        LinkedList l3 = createList(new int[]{2, 6});

        // Step 2: Put them into array
        LinkedList[] lists = new LinkedList[]{l1, l2, l3};

        // Step 3: Call function
        LinkedList result = obj.mergeLists(lists);

        // Step 4: Print result
        printList(result);
    }
}


