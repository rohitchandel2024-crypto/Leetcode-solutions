class Solution {
    void func(TreeNode root , List <Integer> res){
        if(root == null) return;
        func(root.left,res);
        func(root.right,res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        func(root,res);
        return res;
    }
}