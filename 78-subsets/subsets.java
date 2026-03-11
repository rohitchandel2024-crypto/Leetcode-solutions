class Solution {

    void func(int [] nums,int index,List<List<Integer>>res,List<Integer>temp,int n){
        if(n==index){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        func(nums,index+1,res,temp,n);
        temp.remove(temp.size()-1);
        func(nums,index+1,res,temp,n);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = nums.length;
        func(nums,0,res,temp,n);
        return res;
    }
}