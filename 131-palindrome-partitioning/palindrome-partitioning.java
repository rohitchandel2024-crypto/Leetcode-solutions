class Solution {

    boolean isPalindrome(String s, int l ,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    void func(String s , int index , int n , List<List<String>>res ,List<String>temp){
        if(index==n){
            res.add(new ArrayList<>(temp));
            return;
        }
      for(int i=index;i<n;i++){
        if(isPalindrome(s,index,i)){
            temp.add(s.substring(index,i+1));
            func(s,i+1,n,res,temp);
            temp.remove(temp.size()-1);
        }
      }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int n = s.length();
        func(s,0,n,res,temp);
        return res;
    }
}