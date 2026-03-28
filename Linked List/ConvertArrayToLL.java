class Node{

    int data;
    Node next;

    Node(int data){

        this.data=data;
        this.next=null;

    }
    
}

class ConvertArrayToLL{

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

    private static int lenghtOfLinkedList(Node head){

        Node temp=head;
        int count=0;
        while(temp!=null){

            count++;
            temp=temp.next;

        }

        return count;
    }

    private static boolean searchElement(Node head,int val){

        Node temp=head;

        while(temp!=null){

            if(temp.data==val){
                return true;
            }else{
                temp=temp.next;
            }
        }


        return false;
    }

    public static void main(String[]args){

        int val=18;
        int arr[]={1,5,6,8};
        Node head=convertArr2LL(arr);
        // System.out.println(head.data);

        printLinkedList(head);
        System.out.println();
        System.out.println(lenghtOfLinkedList(head));
        System.out.println();

        System.out.println(searchElement(head, val));
    }


}