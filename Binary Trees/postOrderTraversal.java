
class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){

        data=key;
    }

}

public class postOrderTraversal {
    
    static void PostOrder(Node node){
        if(node==null){
            return;
        }

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
    }

     public static void main(String[] args) {
        
        Node n=new Node(1);
        n.left=new Node(2);
        n.right=new Node(3);
        n.left.left=new Node(7);
        n.left.right=new Node(8);

        n.right.left=new Node(9);
        n.right.right=new Node(10);


        PostOrder(n);
    }
}
