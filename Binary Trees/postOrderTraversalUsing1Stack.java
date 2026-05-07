import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class postOrderTraversalUsing1Stack {

    public static void postOrder(TreeNode root) {

        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        TreeNode current = root;

        while (current != null || !st.isEmpty()) {

            // Go to leftmost node
            if (current != null) {

                st.push(current);
                current = current.left;
            }
            else {

                TreeNode temp = st.peek().right;

                // If right subtree does not exist
                if (temp == null) {

                    temp = st.pop();
                    ans.add(temp.val);

                    // Process parent nodes
                    while (!st.isEmpty() && temp == st.peek().right) {

                        temp = st.pop();
                        ans.add(temp.val);
                    }
                }
                else {

                    current = temp;
                }
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)
                ),
                new TreeNode(
                        3,
                        null,
                        null
                )
        );

        postOrder(root);
    }
}