class Solution {

    TreeNode ans = null;
    private void fun(TreeNode root, int val){
        if(root == null) return;
        if(root.val == val){
            ans = root;
            return;
        }
        if(root.val<val){
            fun(root.right,val);
        }else{
            fun(root.left,val);
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        fun(root,val);
        return ans;
    }
}