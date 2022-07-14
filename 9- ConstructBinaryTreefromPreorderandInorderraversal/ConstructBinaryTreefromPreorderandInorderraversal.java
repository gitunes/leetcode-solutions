/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode driver(int[] preorder, int p_start, int p_end, int[] inorder, int in_start, int in_end, Map < Integer, Integer > mp) {
        if (in_start > in_end) return null;

        int ele = preorder[p_start];
        int index = mp.get(ele);
        int n = index - in_start;

        TreeNode root = new TreeNode(ele);
        // For Left Subtree
        root.left = driver(preorder, p_start + 1, p_start + n, inorder, in_start, index - 1, mp);
        // For Right Subtree
        root.right = driver(preorder, p_start + n + 1, p_end, inorder, index + 1, in_end, mp);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map < Integer, Integer > mp = new HashMap < > (); // hashing the index of inorder for faster access.
        int n = inorder.length;
        for (int i = 0; i < n; ++i) mp.put(inorder[i], i);

        return driver(preorder, 0, n - 1, inorder, 0, n - 1, mp);
    }
}