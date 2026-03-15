class Solution {
    void func(TreeNode root, List<Integer>res){
        if(root==null) return;
        res.add(root.val);
        func(root.left,res);
        func(root.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        func(root,res);
        return res;
    }
}