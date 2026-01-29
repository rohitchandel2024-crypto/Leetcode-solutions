class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int mE=nums[0];
        int miE=nums[0];
        int mS=nums[0];
        int miS=nums[0];
     
        for(int i=1 ; i<nums.length ; i++){
            mE=Math.max(mE+nums[i],nums[i]);
            miE=Math.min(miE+nums[i],nums[i]);
            mS=Math.max(mS,mE);
            miS=Math.min(miS,miE);
           
        }
        return  Math.max(mS,Math.abs(miS));
    }
}