package Java;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode tempLeft = root.left;
        root.left = root.right;
        root.right = tempLeft;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
