import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.DoubleStream;

class Node{

    int data;
    Node next;
    Node back;

    Node(int data1,Node next1 ,Node back1){

        this.data=data1;
        this.next=next1;
        this.back=back1;

    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }

}
class deleteAllOccurencse{ 

        private static void printLL(Node head){

        Node temp=head;
        while(temp!=null){

            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    private static Node convertArrayto2Dll(int arr[]){

        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){

            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;

        }

        return head;
    }   


    private static Node deleteOcuurences(Node head ,int key){


        Node temp=head;
        
        while(temp!=null){


            if(temp.data==key){

                if(temp==head){
                    head=head.next;
                }

                Node prevNode=temp.back;
                Node nextNode=temp.next;

                if(prevNode!=null)prevNode.next=nextNode;
                if(nextNode!=null)nextNode.back=prevNode;

                temp=nextNode;

            }else{
                temp=temp.next;
            }


        }

        return head;

    }
    private static Node findTail(Node head){

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;

    }

    private static List<List<Integer>>pairOfSum(Node head,int sum){


        List<List<Integer>>ans=new ArrayList<>();
        Node head1=head;
        Node tail=findTail(head);

while (head1 != null && tail != null && head1 != tail && tail.next != head1)
{
            if(head1.data+tail.data==sum){
                ans.add(Arrays.asList(head1.data,tail.data));

                head1=head1.next;
                tail=tail.back;

            }
            else if(head1.data+tail.data<sum){
                head1=head1.next;
            }
            else{
                tail=tail.back;
            }


        }


        return ans;

    }


    private static Node removeDuplicate(Node head){

        Node temp=head;
        while(temp!=null && temp.next!=null){
          
            Node nextNode=temp.next;


            while(nextNode!=null && nextNode.data==temp.data){

                nextNode=nextNode.next;

            }

            temp.next=nextNode;
            if(nextNode!=null)nextNode.back=temp;


            temp=temp.next;

        }

        return  head;

    }



        
    static Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; // new head after reversal
    }


    static  Node getkthNode(Node temp,int k){

        k=k-1;
        while(temp!=null & k>0){
            k--;
            temp=temp.next;


        }
        return  temp;

    }
    private static Node reverseKthGroup(Node head,int k){


        Node temp=head;
        Node prevLast=null;

        while(temp!=null){
            Node kthNode=getkthNode(temp, k);
            if(kthNode==null){
                if(prevLast!=null)prevLast .next=temp;
                break;
            }


            Node nextNode=kthNode.next;
            kthNode.next=null;
            reverseLL(temp);

            if(temp==head){
                head=kthNode;
            }
            else{
                prevLast.next=kthNode;
            }

            prevLast=temp;
            temp=nextNode;
        

        }
        return head;

    }
    static Node findKthNode(Node temp,int k){

        int cnt=1;
        while(temp!=null){
            if(cnt==k)return temp;
            cnt++;
            temp=temp.next;
        }
        return temp;
    }

    private static Node reverseLLbyKth (Node head ,int k){

        if(head==null || k==0)return head;

        Node tail=head;
        int len=1;

        while(tail.next!=null){
            tail=tail.next;
            len+=1;

        }
        if(k%len==0)return head;

        k=k%len;

        tail.next=head;
        Node newNode=findKthNode(head,len-k);

        head=newNode.next;
        newNode.next=null;


        return  head;
    }


    private static Node mergeSortedLL(Node head1,Node head2){

        Node t1=head1;
        Node t2=head2;
    
        Node dummyNode=new Node(-1);

         Node temp=dummyNode;
        while(t1!=null && t2!=null){

            if(t1.data<t2.data){
                temp.next=t1;
                temp=t1;
                t1=t1.next;

            }else{

                temp.next=t2;
                 temp=t2;
                t2=t2.next;

            }

        }


        if(t1!=null)temp.next=t1;
         else temp.next=t2;

        return dummyNode.next;


    }



    public static void main(String[] args) {
      
        // int arr[]={1,5,1,2,6,3,8,4,5,6};
        // Node head=convertArrayto2Dll(arr);

        // head=addOne(head);
        // printLL(head);


        //For Looping//

        Node head1=new Node(1);
        head1.next=new Node(4);
        head1.next.next=new Node(7);
        head1.next.next.next=new Node(9);
        head1.next.next.next.next=new Node(10);
        head1.next.next.next.next.next=new Node(13);
        

        Node head2=new Node(2);
        head2.next=new Node(5);
        head2.next.next=new Node(9);
        head2.next.next.next=new Node(11);
        head2.next.next.next.next=new Node(15);

        // Node head2=new Node(9);
        // head2.next=head1.next.next.next;

        // head=deleteOcuurences(head,6);
        // printLL(head);

//System.out.println(pairOfSum(head, 14));

        // head=removeDuplicate(head);
        // printLL(head);


        // head=reverseKthGroup(head, 3);
        // printLL(head);


        // head=reverseLLbyKth(head, 3);
        // printLL(head);

        Node head=mergeSortedLL(head1, head2);
        printLL(head);

    }


}