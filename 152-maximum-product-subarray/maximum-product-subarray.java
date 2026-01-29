class Solution {
    public int maxProduct(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       int res=nums[0];
       for(int i=1;i<nums.length;i++){
        int p=max*nums[i];
        int r=min*nums[i];
        min=Math.min(nums[i],Math.min(p,r));
        if(p<nums[i] && r<nums[i]){
            max=nums[i];
        }
        else if(p<r) max=r;
        else max=p;
        res=Math.max(res,max);
       }
       return res;
    }
}
