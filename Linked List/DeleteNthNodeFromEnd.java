class Node{

    int data;
    Node next;
    Node back;
    Node child;

    Node(int data1,Node next1 ,Node back1){

        this.data=data1;
        this.next=next1;
        this.back=back1;
        this.child=null;

    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }

}
public class DeleteNthNodeFromEnd {

        private static void printLL(Node head){

        Node temp=head;
        while(temp!=null){

            System.out.print(temp.data+" ");
            temp=temp.child;
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

private static Node deleteNthNode(Node head,int n){

    if(head==null || n<=0){
        return head;
    }

    Node fast=head;

    for(int i=1;i<=n;i++){

        fast=fast.next;
    }
    Node slow=head;
    if(fast==null){
        return head.next;
    }
    while(fast.next!=null){

        fast=fast.next;
        slow=slow.next;

    }
  
    slow.next=slow.next.next;

    return head;

}

private static Node reverseTheLL(Node head){

    Node temp=head;
    Node prve=null;
    Node front;


    while(temp!=null){

        front=temp.next;
        temp.next=prve;
        prve=temp;
        temp=front;

    }

    return prve;
}

private static Node reverseLLUsingRecursion(Node head){

    if(head==null || head.next==null){
        return head;
    }

    Node newNode=reverseLLUsingRecursion(head.next);
    Node front=head.next;
    front.next=head;
    head.next=null;

return newNode;


}

static Node merge(Node list1,Node list2){

    Node dummyNode=new Node(-1);
    Node res=dummyNode;

    while(list1!=null && list2!=null){

        if(list1.data<list2.data){
            res.child=list1;
            res=list1;
            list1=list1.child;
        }else{

            res.child=list2;
            res=list2;
            list1=list2.child;

        }
        res.next=null;

    }

    if(list1!=null) res.child=list1;
    else {
        res.child=list2;
    }

    if(dummyNode.child!=null)dummyNode.child.next=null;

    return dummyNode.child;


}




private static Node flattenLL(Node head){


    if(head==null || head.next==null) return  head;

    Node mergeHead=flattenLL(head.next);
    head=merge(head,mergeHead);
    return head;

}
   



    public static void main(String[] args) {
        
// int arr[]={2,3,6,7,8};
// Node head=convertArrayto2Dll(arr);

// head=deleteNthNode(head, 5);
// printLL(head);

// head=reverseTheLL(head);
// printLL(head);
//head=reverseLLUsingRecursion(head);


 Node head = new Node(3);
        Node n10 = new Node(10);
        Node n20 = new Node(20);
        head.next = n10;
        n10.next = n20;

        head.child = new Node(7);
        head.child.child = new Node(8);

        n10.child = new Node(15);

        n20.child = new Node(22);
        n20.child.child = new Node(30);
        n20.child.child.child = new Node(35);
        n20.child.child.child.child = new Node(40);
        n20.child.child.child.child.child = new Node(50);

        // Flatten
        head = flattenLL(head);

        printLL(head);

    }
}