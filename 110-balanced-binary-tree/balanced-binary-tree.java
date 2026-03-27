class Solution {
    boolean ans = true;
    private int func(TreeNode root){
        if(root==null) return 0;
        int left = func(root.left);
        int right = func(root.right);
        if(Math.abs(left-right)>1) ans = false;
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        func(root);
        return ans;
    }
}