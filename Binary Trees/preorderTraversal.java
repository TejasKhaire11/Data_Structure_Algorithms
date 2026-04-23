
class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){

        data=key;
    }

}

public class preorderTraversal {
    
    static void preOrder(Node node){

        if(node==null){
            return;
        }

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public static void main(String[] args) {
        
        Node n=new Node(1);
        n.left=new Node(2);
        n.right=new Node(3);
        n.left.left=new Node(7);
        n.left.right=new Node(8);

        n.right.left=new Node(9);
        n.right.right=new Node(10);


        preOrder(n);
    }
}



