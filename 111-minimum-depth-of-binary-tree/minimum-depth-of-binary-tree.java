class Solution {
    private int func(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left==null) return 1+func(root.right);
        if(root.right==null) return 1+func(root.left);
        return 1+Math.min(func(root.left),func(root.right));
    }
    public int minDepth(TreeNode root) {
        return func(root);
    }
}