
import  java.util.*;

class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val,TreeNode left ,TreeNode right) {
   
        this.val=val;
        this.right=right;
        this.left=left;

    }    
}


public class postOrderTraversalUsing2Stack {
 

    public static void postOrder(TreeNode root){

        Stack<TreeNode>st1=new Stack<>();

        Stack<TreeNode>st2=new Stack<>();

        if(root==null)return;

        st1.push(root);

        while(!st1.isEmpty()){

          TreeNode node=st1.pop();
          
          st2.push(node);

          if(node.left!=null){
          
            st1.push(root.left);

          }
          if(node.right!=null){
         
            st1.push(root.right);

          }      
    }



    }


}
