class Solution {

    boolean sahi(int [] have, int [] need){
        for(int i=0;i<256;i++){
            if(have[i]<need[i]) return false;
        }
        return true;
    }
    

    public String minWindow(String s, String t) {
    int [] have = new int [256];
    int [] need = new int [256];

    for(char c:t.toCharArray()){
        need[c]++;
    }
    int low=0;
    int start=0;
    int res=Integer.MAX_VALUE;
    for(int high=0;high<s.length();high++)
    {
        char ch=s.charAt(high);
        have[ch]++;
    
    while(sahi(have,need)){
        int len=high-low+1;
        if(len<res) {
            res=len;
            start=low;
        }
        have[s.charAt(low)]--;
        low++;
    }
    }
    return res ==Integer.MAX_VALUE ? "" : s.substring(start,start+res);
    }
}
