class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int count = 0 ;
        int product = 1;
        int n = nums.length;
        if(k<=1) return 0;
        for(int j=0;j<n;j++){
            product*=nums[j];
            while(product>=k){
                product/=nums[i];
                i++;
            }
            count+=(j-i+1);
        }
        return count;
    }
}