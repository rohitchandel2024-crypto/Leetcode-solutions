class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void func(TreeNode root, int sum,int targetSum,List<Integer> temp){
        if(root==null) return;
        sum+=root.val;
        temp.add(root.val);
        if(root.left==null && root.right==null){ 
        if(sum==targetSum){
            res.add(new ArrayList<>(temp));
        }}
        func(root.left,sum,targetSum,temp);
        func(root.right,sum,targetSum,temp);
        temp.remove(temp.size()-1);
        return;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        func(root,0,targetSum,new ArrayList<>());
        return res;
    }
}