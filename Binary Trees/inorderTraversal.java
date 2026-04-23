import java.util.*;

class Node{

    int data;
    Node left;
    Node right;


    public Node(int key){

        data=key;

    }

}

public class inorderTraversal {


    static void inorder(Node node){

        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);

    }
    public static void main(String[] args) {
        
        Node n=new Node(1);
        n.left=new Node(2);
        n.right=new Node(3);
        n.left.left=new Node(7);
        n.left.right=new Node(8);

        n.right.left=new Node(9);
        n.right.right=new Node(10);


        inorder(n);

    }
}