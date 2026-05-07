
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
public class iterativeInorderTraversal {
 
    public static List<Integer>iterativeInorder(TreeNode root){
    Stack<TreeNode>st=new Stack<>();

    List<Integer>ans=new ArrayList<>();

    //base case
    if(root==null) return new ArrayList<>();

    TreeNode node=root;
  

    while(!st.isEmpty()){


        if(node!=null){
            st.push(node);
            node=node.left;
            
        }else{

            node=st.pop();
            ans.add(node.val);

            node=node.right;

        }
    }
    return ans;

    }
}