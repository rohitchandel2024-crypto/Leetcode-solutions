class Solution {
    public int hIndex(int[] citations) {
      int n=citations.length;
      int [] freq = new int [n+1];
      for(int i=0;i<n;i++){
        if(citations[i]>=n) freq[n]++;
        else freq[citations[i]]++;
      }
      int h = n;
      int num = freq[n];
      while(num<h){
        h--;
        num+=freq[h];
      }
      return h;
    }
}