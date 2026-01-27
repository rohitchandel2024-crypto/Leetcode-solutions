class Solution {
    public int characterReplacement(String s, int k) {
      int freq[]=new int[256];
      int low=0;
      int res=0;
      int maxCount=0;
      for(int high=0;high<s.length();high++){
        char ch = s.charAt(high);
        freq[ch]++;
        int len =high-low+1;
        maxCount=Math.max(freq[ch],maxCount);
        if(len-maxCount>k){
            freq[s.charAt(low)]--;
            low++;
        }
        res=Math.max(res,high-low+1);
      }
      return res;
    }
}