class Solution {
    TreeNode p;
    TreeNode q;
    TreeNode result;
    
    private boolean foundNode (TreeNode root){
        if(root == null) 
            return false;
        
        boolean isValue = root.val == p.val || root.val == q.val;
        boolean left = foundNode(root.left);
        boolean right = foundNode(root.right);
        if(( left && right) || (isValue && (left || right)))
            if(result == null) result = root;
            
        if(isValue || left || right)
            return true;
        else return false;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.p = p;
        this.q = q;
        foundNode(root);
        return result;
    }
}