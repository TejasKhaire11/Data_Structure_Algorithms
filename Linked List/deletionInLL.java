class Node{

    int  data;
    Node next;
    
    Node(int data){

        this.data=data;
        this.next=null;
    }

}

class deletionInLL{

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

    private static void print(Node head){

        while(head!=null){

            System.out.print(head.data+" ");
            head=head.next;
          
        }
        System.out.println();


    }

    private static Node deleteHead(Node head){

        // Node temp=head;
        if(head==null) return head;
        head=head.next;


        return head;
    }
    private static Node deleteTail(Node head){

        if(head==null || head.next==null) return null;

    Node temp=head;

    while(temp.next.next!=null){

        temp=temp.next;
    }
    temp.next=null;
    return head;

    }
    private static Node deleteKthElement(Node head,int k){

        if(head==null)return head;

        if(k==1){

            head=head.next;
            return head;

        }

        int count=0;
        Node prev=null;
        Node temp=head;

        while(temp!=null){

            count++;
           
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;


        }

        return head;

    }
private static Node deleteElementByValue(Node head,int value){

        if(head==null)return head;

        if(head.data==value){

            head=head.next;
            return head;

        }

        Node prev=null;
        Node temp=head;

        while(temp!=null){

           
            if(temp.data==value){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;


        }

        return head;

    }



    public static void main(String[] args) {
        
    int arr[]={12,5,6,7,11};

    Node head=convertArr2LL(arr);
    //System.out.println(head.data);
   // head=deleteTail(head);
    head=deleteKthElement(head, 2);
    print(head);

    head=deleteElementByValue(head, 6);
    print(head);
    // head=deleteHead(head);
    // print(head);



    }


}