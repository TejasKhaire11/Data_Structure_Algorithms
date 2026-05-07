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
class levelOrderTraversal{


    public static List<List<Integer>>levelOrder(TreeNode root){
    
        Queue<TreeNode>queue=new LinkedList<>();

        List<List<Integer>>ans=new ArrayList<>();

        if(root==null) return new ArrayList<>();

        queue.add(root);
       

        while(!queue.isEmpty()){

            int size=queue.size();

            List<Integer>list=new ArrayList<>();

            for(int i=0;i<size;i++){

            TreeNode current=queue.poll();

            list.add(current.val);


            if(current.left!=null){

                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
           
            }
         }
         ans.add(list);
    }   

        return ans;
    }
      
}