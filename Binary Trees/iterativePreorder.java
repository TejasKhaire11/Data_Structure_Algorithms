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
public class iterativePreorder {
    
    public static List<Integer>iterativeTraversal(TreeNode root){

    List<Integer>ans=new ArrayList<>();

    Stack<TreeNode>st=new Stack<>();

    if(root==null) return new ArrayList<>();

    st.push(root);

    while(!st.isEmpty()){

       root=st.pop();
       ans.add(root.val);

       if(root.right!=null){
        st.push(root.right);
       }
       if(root.left!=null){
        st.push(root.left);
       }

    }
    return ans;
    }

}
