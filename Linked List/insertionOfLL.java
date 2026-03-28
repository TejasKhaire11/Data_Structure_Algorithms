class Node{

    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class insertionOfLL {

        private static Node convertArr2LL(int arr[]){

        Node head=new Node(arr[0]);
        Node mover=head;

        for(int i=1;i<arr.length ;i++){

            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }

        return head;
    }   
      private static  void printLinkedList(Node head){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }


    }
    private static Node insertAtHead(Node head,int val){

        Node temp=new Node(val);

        temp.next=head;
        return temp;

    }
    private static Node insertAtTail(Node head ,int val){

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        Node newNode=new Node(val);
        temp.next=newNode;

        return head;

    }
    private static Node insertElementAtPosition(Node head,int el,int k){

        if(head==null){

            if(k==1){

                return new Node(el);
            }
            else{
                return head;
            }

        }
        if(k==1){
            return new Node(el);
        }
        int count=0;
        Node temp=head;

        while(temp!=null){

            if(count==(k-1)){
                Node x=new Node(el);
                x.next=temp.next;
                temp.next=x;

                break;
            }

            temp=temp.next;
            count++;
        }
        return head;
    }
    private static Node insertElementbeforValue(Node head,int newValue,int targetValue){

        if(head==null){
            return null;
        }
        if(head.data==targetValue){
            Node newnode=new Node(newValue);
            newnode.next=head;

            return newnode;
        }

        Node temp=head;

        while(temp.next!=null){

            if(temp.next.data==targetValue){
                Node x=new Node(newValue);
                x.next=temp.next;
                temp.next=x;

                break;
            }

            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,8,11};
        Node head=convertArr2LL(arr);
        // head=insertAtHead(head, 100);
        // printLinkedList(head);
        // System.out.println();
        // head=insertAtTail(head, 50);
        // printLinkedList(head);
        // head=insertElementAtPosition(head, 131, 3);
        // printLinkedList(head);
        head=insertElementbeforValue(head, 15, 5);
        printLinkedList(head);
    }

}
