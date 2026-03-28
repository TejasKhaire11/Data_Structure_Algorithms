import java.util.HashMap;

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
class add1ToLL{
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
    static int helperFunction(Node temp){

        if(temp==null){
            return 1;
        }
        int carry=helperFunction(temp.next);
        temp.data+=carry;
        if(temp.data<10)return 0;
        temp.data=0;
        return 1;

    }

    private static Node addOne(Node head){

        int carry=helperFunction(head);
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            head=newNode;
        }

        return head;

    }


    private static Node findIntersection(Node firstHead,Node secondHead){

        if(firstHead==null || secondHead==null)return null;

        Node temp1=firstHead;
        Node temp2=secondHead;


        while(temp1!=temp2){

            if(temp1==temp2)return temp1;

            temp1=temp1.next;
            temp2=temp2.next;

        
            if(temp1==null) temp1=secondHead;
            if(temp2==null)temp2=firstHead;

        }

        return temp1;

    }
   private static Node findMiddleElemntINLL(Node head){

    Node temp=head;

    Node fast=temp;
    Node slow=temp;

    while(fast !=null && fast.next!=null){

        slow=slow.next;
        fast=fast.next.next;

    }

    return slow;

}

private static Boolean detectTheLoopINLL(Node head){


   
    Node slow=head;
    Node fast=head;

    if(head==null || head.next==null){
        return true;
    }

    while(fast!=null && fast.next!=null){

        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            return true;
        }
    }

    return false;
}

private static int lenghtOfLoop(Node head){


    Node temp=head;

    int count=0;

    HashMap<Node,Integer>map=new HashMap<>();

    while(temp!=null){

        if(map.containsKey(temp)){

            return count-map.get(temp);

        }

        map.put(temp,count);
        count++;
        temp=temp.next;

    }

        return 0;
    }

    static int callingToFunction(Node slow,Node fast){
        int cnt=1;
        fast=fast.next;


        while(slow!=fast){

            cnt++;
            fast=fast.next;


        }
        return cnt;

    }


    private static int lenghtOfLoopInLL(Node head){

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){

                return callingToFunction(slow,fast);
            }

        }

        return 0;

    }

    private static Node deleteTheMiddleOfLL(Node head){

        Node slow=head;
        Node fast=head;

         fast=fast.next.next;
        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;



        }
        slow.next=slow.next.next;

        return head;

    }

    private static Node firstValueOfLoop(Node head){

        Node slow=head;
        Node fast=head;


        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;

                while(slow!=fast){

                    slow=slow.next;
                    fast=fast.next;

                }
                return slow;
            }

        }


        return null;

    }

    private static Node eliminateSameOccurences(Node head ,int k){

        Node temp=head;


        while(temp!=null){

            if(temp.data==k){

                if(temp==head){
                    head=temp.next;
                }

                Node nextNode=temp.next;
                Node prevNode=temp.back;


                if(nextNode!=null)nextNode.back=prevNode;
                if(prevNode!=null)prevNode.next=nextNode;

                temp=nextNode;


            }
            else{
                temp=temp.next;
            }




        }

        return head;

    }


    public static void main(String[] args) {
        
        int arr[]={1,6,8,9,6,4};
        Node head=convertArrayto2Dll(arr);

        // head=addOne(head);
        // printLL(head);


        //For Looping//

        // Node head1=new Node(1);
        // head1.next=new Node(2);
        // head1.next.next=new Node(3);
        // head1.next.next.next=new Node(4);
        // head1.next.next.next.next=new Node(5);
        // head1.next.next.next.next.next=new Node(6);
        // head1.next.next.next.next.next.next=head1.next.next;

        // Node head2=new Node(9);
        // head2.next=head1.next.next.next;

    //     Node intersection=findIntersection(head1, head2);
    //     if(intersection!=null)System.err.println(intersection.data);
    //    else System.out.println("Not found");

    // Node middle=findMiddleElemntINLL(head);
    // System.out.println(middle.data);

    // boolean ans=detectTheLoopINLL(head1);
    // System.out.println(ans);

    // head=deleteTheMiddleOfLL(head);
    // printLL(head);

    // Node head=firstValueOfLoop(head1);
    
    // System.out.println(head.data);


     head=eliminateSameOccurences(head,6 );
     printLL(head);


    }

}