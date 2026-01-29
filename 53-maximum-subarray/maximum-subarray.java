class Solution {
    public int maxSubArray(int[] nums) {
        int bestEnding=nums[0];
        int res = bestEnding;
        for(int i=1;i<nums.length;i++){
            int sum = bestEnding+nums[i];
            if(sum<nums[i]){ bestEnding=nums[i];
            if(res<bestEnding) res=bestEnding;}
            else{
                bestEnding=sum;
                if(res<bestEnding) res=bestEnding;
                
            }
        }

        return res;

    }
}