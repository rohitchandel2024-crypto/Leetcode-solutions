class Solution {
    public int findUnsortedSubarray(int[] nums) {
      int n =nums.length;
      int [] sorted = nums.clone();
      Arrays.sort(sorted);
      int left = n ,right =0;
      for(int i=0;i<n;i++){
        if(nums[i]!=sorted[i]){
            left = Math.min(left,i);
            right= Math.max(right,i);
        }
      }
      return right>left ? right-left+1:0;
    }
}