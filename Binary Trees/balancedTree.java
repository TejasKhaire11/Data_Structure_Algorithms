import java.util.*;

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

public class balancedTree {
  
    
    private static int CheckHight(TreeNode node){

        if(node==null)return 0;

        int leftDepth=CheckHight(node.left);
        if(leftDepth==-1)return -1;

        int rightDepth=CheckHight(node.right);

        if(rightDepth==-1)return -1;
        int diff=Math.abs(leftDepth-rightDepth);
        if(diff<=1){
        return Math.max(leftDepth,rightDepth)+1;
        }
        else{
            return -1;
        }

    }

    public static Boolean isBalanced(TreeNode root){
        return CheckHight(root)!=-1;
    }

}
