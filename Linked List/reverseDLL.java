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

public class reverseDLL {
    


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

    private static Node reverseTheLL(Node head){

        Node last=null;
        Node current=head;

        while(current!=null){

            last=current.back;
            current.back=current.next;
            current.next=last;

           
            current=current.back;
        }
        // if(last!=null){
        //     head=last.back;
        // }
      
        head=last.back;

        return head;


    }

    private static Node sumOfLL(Node head1,Node head2){

        Node t1=head1;
        Node t2=head2;
        int sum=0;

        Node dummyNode =new Node(-1);
        Node curr=dummyNode;
        int carry=0;

        while(t1!=null || t2!=null){

            sum=carry;

            if(t1!=null) sum=sum+t1.data;

            if(t2!=null) sum=sum+t2.data;

            Node newNode=new Node(sum%10);

            carry=sum/10;

            curr.next=newNode;

            curr=curr.next;

            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;


        }

        if(carry!=0){

            Node newNode=new Node(carry);
            curr.next=newNode;
        }
        return dummyNode.next;

    }


    public static void main(String[] args) {
        
    // int arr[]={5,4,3,2,1};
    // Node head=convertArrayto2Dll(arr);
    // head=reverseTheLL(head);
    // printLL(head);


    int arr1[]={3,5};

    int arr2[]={4,5,9,9};

    Node head1=convertArrayto2Dll(arr1);
    Node head2=convertArrayto2Dll(arr2);

    Node head=sumOfLL(head1, head2);
    System.out.println("Addtion of two Linked List");
    printLL(head);


    }
}
