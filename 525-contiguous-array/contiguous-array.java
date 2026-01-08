class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        int zero=0;
        int one=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }
            int diff=one-zero;
            if(diff==0){
            res=Math.max(res,i+1);
            
            }
            if(!freq.containsKey(diff)){
                freq.put(diff,i);
            }
            else{
                int ind=freq.get(diff);
                int len=i-ind;
               res=Math.max(len,res);
            }
        }return res;
    }
}