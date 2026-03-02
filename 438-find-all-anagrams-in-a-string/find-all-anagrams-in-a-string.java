class Solution {
   public boolean matches(int [] a , int [] b){
    for(int i=0;i<26;i++){
        if(a[i]!=b[i]) return false;
    }
    return true;
   }
    public List<Integer> findAnagrams(String s, String p) {
       List <Integer> res = new ArrayList<>();
       int n= s.length();
       int m = p.length();
       if(m > n) return res;
       int [] count1 = new int [26];
       int [] count2 = new int [26];
       for(char c: p.toCharArray()){
        count1[c-'a']++;
       }
       for(int i=0 ;i<m;i++){
        count2[s.charAt(i)-'a']++;
       }
       if(matches(count1,count2)) res.add(0);
       for(int i=m ;i<n;i++){
        count2[s.charAt(i)-'a']++;
        count2[s.charAt(i-m)-'a']--;
        if(matches(count1,count2)) res.add(i-m+1);
       }
       return res;
    }
    
}