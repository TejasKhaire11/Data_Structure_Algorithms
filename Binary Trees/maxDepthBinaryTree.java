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

public class maxDepthBinaryTree {
    
    public static int maxDepth(TreeNode node){

        Queue<TreeNode>q=new LinkedList<>();

        /*
        if(node==null)return 0;

        int leftDepth=maxDepth(node.left);

        int rightDepth=maxDepth(node.right);

        return Math.max(leftDepth,rightDepth)+1;
        */
        int count=0;
        if(node==null)return 0;

        q.add(node);

        while(!q.isEmpty()){                    

            int s=q.size();

            for(int i=0;i<s;i++){
            
            TreeNode value=q.poll();
            
            if(value.left!=null){
                q.add(value.left);
            }
            if(value.right!=null){
                q.add(value.right);
            }
           

        }
         count=count+1;
     }
     return count;
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3, null, null));

        System.out.println("Max Depth = " + maxDepth(root));
    }
}
    


