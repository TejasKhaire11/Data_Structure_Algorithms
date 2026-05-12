
import java.util.*;

class TreeNode{

    int val;
    TreeNode right;
    TreeNode left;

    public TreeNode(int val,TreeNode left,TreeNode right) {
        
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class MaxDiameter {
   
    public static int maxdiameter(TreeNode node){

        int diameter[]=new int[1];
        hight(node, diameter);

        return diameter[0];

    }

    public  static int hight(TreeNode node,int diameter[]){


        if(node==null)return 0;
        int lefthight=hight(node.left, diameter);

        int righthight=hight(node.right, diameter);

        diameter[0]=Math.max(diameter[0],lefthight+righthight);

        return 1+Math.max(lefthight, righthight);

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3, null, null));

        System.out.println("Max Depth = " + maxdiameter(root));
    }
}

