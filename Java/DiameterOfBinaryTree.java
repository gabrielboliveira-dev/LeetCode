package Java;

public class DiameterOfBinaryTree {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calculateHeight(root);
        return maxDiameter;
    }

    private int calculateHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);
        int currentPath = leftHeight + rightHeight;

        maxDiameter = Math.max(maxDiameter, currentPath);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
