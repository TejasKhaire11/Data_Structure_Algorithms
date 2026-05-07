import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Pair {

    TreeNode node;
    int state;

    Pair(TreeNode node, int state) {
        this.node = node;
        this.state = state;
    }
}

public class PreInPostTraversal {

    public static void preInPostTraversal(TreeNode root) {

        if (root == null) return;

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        Deque<Pair> st = new ArrayDeque<>();

        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {

            Pair it = st.pop();

            // Preorder
            if (it.state == 1) {

                pre.add(it.node.val);

                it.state++;
                st.push(it);

                if (it.node.left != null) {
                    st.push(new Pair(it.node.left, 1));
                }
            }

            // Inorder
            else if (it.state == 2) {

                in.add(it.node.val);

                it.state++;
                st.push(it);

                if (it.node.right != null) {
                    st.push(new Pair(it.node.right, 1));
                }
            }

            // Postorder
            else {

                post.add(it.node.val);
            }
        }

        System.out.println("Preorder  : " + pre);
        System.out.println("Inorder   : " + in);
        System.out.println("Postorder : " + post);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        preInPostTraversal(root);
    }
}