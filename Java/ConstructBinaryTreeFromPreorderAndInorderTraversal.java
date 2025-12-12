package Java;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    private Map<Integer, Integer> inorderIndexMap;

    private int preorderIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return arrayToTree(preorder, 0, inorder.length - 1);
    }

    private TreeNode arrayToTree(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootValue = preorder[preorderIndex];
        TreeNode root = new TreeNode(rootValue);
        preorderIndex++;

        int rootIndexInInorder = inorderIndexMap.get(rootValue);

        root.left = arrayToTree(preorder, left, rootIndexInInorder - 1);
        root.right = arrayToTree(preorder, rootIndexInInorder + 1, right);

        return root;
    }
}
