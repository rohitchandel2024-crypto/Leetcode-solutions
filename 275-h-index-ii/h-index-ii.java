class Solution {
    public int hIndex(int[] citations) {
     int n = citations.length;
     int low = 0;
     int high = n-1;
     while(low<=high){
        int guess = low+(high-low)/2;
        if(citations[guess]==n-guess) return n-guess;
        else if (citations[guess]<n-guess) low = guess+1;
        else high =guess-1;
     }
     return n-low;
    }
}