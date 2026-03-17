class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        while(!q.isEmpty()){
            int lvlSize = q.size();
            int first = 0;
            int last = lvlSize-1;
            List<Integer>temp = new ArrayList<>();
            for(int i=0;i<lvlSize;i++){
                temp.add(0);
            }
            while(lvlSize-- >0){
                TreeNode t = q.peek();
                q.poll();
                if(leftToRight){
                    temp.set(first,t.val);
                    first++;
                }
                else{
                    temp.set(last,t.val);
                    last--;
                }
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
            leftToRight=!leftToRight;
            res.add(temp);
        }
        return res;
    }
}