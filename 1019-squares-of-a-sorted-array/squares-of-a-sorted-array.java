class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[] = new int [n];
        int i=0;
        int j=nums.length-1;
        
        int ind =n-1;
        while(i<=j){
            int lsq=nums[i]*nums[i];
            int rsq=nums[j]*nums[j];
            if(lsq>rsq){
                res[ind--]=lsq;
                i++;
            }
            else
            {
                res[ind--]=rsq;
                j--;
            }
        }return res;
    }
}