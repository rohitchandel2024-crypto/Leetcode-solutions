class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total =0;
        int minEnding=nums[0];
        int maxEnding=nums[0];
        int maxSum=nums[0];
        int minSum=nums[0];
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(i>0){
                maxEnding=Math.max(maxEnding+nums[i],nums[i]);
                maxSum=Math.max(maxEnding,maxSum);
                minEnding=Math.min(minEnding+nums[i],nums[i]);
                minSum=Math.min(minEnding,minSum);
                
            }
        }
        if(maxSum<0) return maxSum;
        return Math.max(maxSum,total-minSum);
    }
}