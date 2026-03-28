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

class convertArr2DLL{

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

    private static Node deleteHead(Node head){

    if(head==null || head.next==null){
        return null;
    }
    Node prev=head;

    head=head.next;
    prev.next=null;
    head.back=null;


    return head;
    }

    private static Node deleteTail(Node head){

        if(head==null || head.next==null){
            return null;
        }

        Node tail=head;
        while(tail.next!=null){

            tail=tail.next;

        }
        Node newTail=tail.back;
        tail.back=null;
        newTail.next=null;

        return head;
    }

    private static Node deleteKthPosition(Node head,int k){

        if(head==null){
            return null;
        }
        int count=0;

        Node knode=head;
        while(knode!=null){

            count++;
            if(count==k) break;
            knode=knode.next;

        }

        Node prev=knode.back;
        Node front=knode.next;

        if(prev==null && front==null) {
            return null;
        }
        else if(prev==null){
            return deleteHead(head);
        }
        else if(front==null){
            return deleteTail(head);
        }

        prev.next=front;
        front.back=prev;

        knode.back=null;
        knode.next=null;

        return head;

    }

    private static Node deleteElemtbyValue(Node head,int value){

        if(head==null){
            return null;
        }
      

        Node knode=head;
        while(knode!=null){

            if(knode.data==value) break;
            knode=knode.next;

        }

        Node prev=knode.back;
        Node front=knode.next;

        if(prev==null && front==null) {
            return null;
        }
        else if(prev==null){
            return deleteHead(head);
        }
        else if(front==null){
            return deleteTail(head);
        }

        prev.next=front;
        front.back=prev;

        knode.back=null;
        knode.next=null;

        return head;

    }

    private static Node insertElementBeforeHead(Node head,int data){

        if(head==null) return null;

        Node newHead=new Node(data);

        newHead.next=head;
        head.back=newHead;


        return newHead;

    }


    private static Node insertElementBeforeTail(Node head,int data){

        if(head==null){
            return new Node(data);
        }
        if(head.next==null){

            Node newHead=new Node(data);

            newHead.next=head;
            head.back=newHead;

            return newHead;

        }

        Node tail=head;

        while(tail.next.next!=null){

            tail=tail.next;
        }
        Node newTail=new Node(data);
        Node last=tail.next;

       tail.next=newTail;
       newTail.back=tail;
      
       newTail.next=last;
       last.back=newTail;

        return head;

    }
    private static Node InsertElementBeforeKthPosition(Node head,int data,int k){


        if(head==null){
            return new Node(data);
        }

    

        Node temp=head;
        int count=1;

        while(temp!=null){
        
            if(count==k-1) break;

            count++;
            temp=temp.next;
        }
        Node newNode=new Node(data);
        Node NewTemp=temp.next;

        temp.next=newNode;
        newNode.back=temp;

        newNode.next=NewTemp;
        NewTemp.back=newNode;



        return head;

    }
    private static Node InsertElementBeforeValue(Node head,int data,int value){


        if(head==null){
            return new Node(data);
        }


        Node temp=head;
    

        while(temp!=null){
        
            if(temp.next.data==value) break;
            temp=temp.next;
        }
        Node newNode=new Node(data);
        Node NewTemp=temp.next;

        temp.next=newNode;
        newNode.back=temp;

        newNode.next=NewTemp;
        NewTemp.back=newNode;



        return head;

    }
    
    public static void main(String[] args) {
      
        int arr[]={12,13,4,5,6};

        Node head=convertArrayto2Dll(arr);
        // printLL(head);

        // head=deleteHead(head);
        // printLL(head);

        // head=deleteTail(head);
        // printLL(head);

        // head=deleteKthPosition(head, 2);
        // printLL(head);

        // head=deleteElemtbyValue(head, 5);
        // printLL(head);


        //INSERTION INTO DLL BEFORE


        // head=insertElementBeforeHead(head, 11);
        // printLL(head);

        // head=insertElementBeforeTail(head, 41);
        // printLL(head);

        // head=InsertElementBeforeKthPosition(head, 111,13);
        // printLL(head);

        head=InsertElementBeforeValue(head, 11, 13);
        printLL(head);

    }

}