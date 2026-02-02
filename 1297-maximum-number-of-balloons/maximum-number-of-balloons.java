class Solution {
    public int maxNumberOfBalloons(String text) {
    HashMap<Character,Integer> have=new HashMap<>();
    int n=text.length();
    for(int i=0;i<n;i++){
        char ch =text.charAt(i);
        have.put(ch,have.getOrDefault(ch,0)+1);
    }
    HashMap<Character,Integer> need=new HashMap<>();
    need.put('b',1);
    need.put('a',1);
    need.put('l',2);
    need.put('o',2);
    need.put('n',1);
    int res=Integer.MAX_VALUE;
    for(Map.Entry<Character,Integer>entry:need.entrySet()){
        char ch=entry.getKey();
        int required=entry.getValue();
        int available=have.getOrDefault(ch,0);
        res=Math.min(res,available/required);
    }
    return res;
    }
}