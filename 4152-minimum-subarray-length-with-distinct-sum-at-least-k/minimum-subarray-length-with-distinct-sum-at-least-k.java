import java.util.*;

class Solution {
    public int minLength(int[] nums, int k) {
       HashMap<Integer,Integer> freq = new HashMap<>();
       int left=0;
       long sum=0;
       int minLen=Integer.MAX_VALUE;
       for(int right=0;right<nums.length;right++){
        int val=nums[right];
        freq.put(val,freq.getOrDefault(val,0)+1);
        if(freq.get(val)==1){
            sum+=val;
        }
        while(sum>=k){
            minLen=Math.min(minLen,right-left+1);
            int leftVal=nums[left];
            freq.put(leftVal,freq.get(leftVal)-1);
            if(freq.get(leftVal)==0){
                sum-=leftVal;
            }left++;
        }
       }
       return minLen==Integer.MAX_VALUE ? -1:minLen;
    }
}
