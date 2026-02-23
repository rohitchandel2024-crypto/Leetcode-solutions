class Solution {
    public int hIndex(int[] citations) {
      Arrays.sort(citations);
      int h=0;
      int n=citations.length;
      for(int i=0;i<n;i++){
        int papers=n-i;
        if(citations[i]>=papers){
        h=papers;
        break;}
      }  
      return h;
    }
}