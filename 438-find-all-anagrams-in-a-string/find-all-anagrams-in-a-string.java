class Solution {
     private boolean matches(int [] a ,int [] b){
            for(int i=0;i<26;i++){
                if(a[i]!=b[i]) return false;
            }
            return true;
        }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int  n= s.length();
        int m= p.length();
        int [] count1 = new int [26];
        int [] count2 = new int [26];
        if(m>n) return res;
        for(char ch:p.toCharArray()){
            count1[ch-'a']++;
        }

        for(int i=0;i<m;i++){
            count2[s.charAt(i)-'a']++;
        }
        if(matches(count1,count2)) res.add(0);

        for(int i=m;i<n;i++){
            char ch=s.charAt(i);
            count2[ch-'a']++;
            count2[s.charAt(i-m)-'a']--;

            if(matches(count1,count2)) res.add(i-m+1);
        }
        
        return res;
    }
}