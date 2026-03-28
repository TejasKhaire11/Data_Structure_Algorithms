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
 public class OddEven {

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

    private static Node oddEvenSepration(Node head){

        Node odd=head;
        Node even=head.next;
        Node evenHead=head.next;

        while(even!=null && even.next!=null){

            odd.next=odd.next.next;
            even.next=even.next.next;


            odd=odd.next;
            even=even.next;



        }
        odd.next=evenHead;

        return head;
    }
    private static Node zerosOnesTwo(Node head){

        Node temp=head;

        if(head==null || head.next==null)return null;

        Node zeroNode =new Node(-1);
        Node oneNode=new Node(-1);
        Node twoNode=new Node(-1);

        Node zeroHead=zeroNode;
        Node oneHead=oneNode;
        Node twoHead=twoNode;
    
        while(temp!=null){

            if(temp.data==0){

                zeroNode.next=temp;
                zeroNode=temp;
            

            }
            else if(temp.data==1){
                oneNode.next=temp;
                oneNode=temp;
               

            }
            else{

                twoNode.next=temp;
                twoNode=temp;
              

            }
             temp=temp.next;



        }
        if(zeroHead.next==null){

            zeroHead.next=oneHead.next;

        }

        if(oneHead.next!=null){

            zeroNode.next=oneHead.next;

        }else{
            zeroNode.next=twoHead.next;
        }
        if(twoHead.next!=null){

            oneNode.next=twoHead.next;

        }else{
            twoHead.next=null;
        }
        

        return zeroHead.next;
    }

    public static void main(String[] args) {
      int arr[]={1,0,2,0,0,1,2};

        Node head=convertArrayto2Dll(arr);

        // head=oddEvenSepration(head);
        // printLL(head);

        head=zerosOnesTwo(head);
        printLL(head);

    }
}
