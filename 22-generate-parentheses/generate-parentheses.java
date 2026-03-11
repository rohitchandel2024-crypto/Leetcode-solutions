class Solution {
    void func(int n , String temp ,List<String>res, int open ,int close){
        if(open == n && close == n){
            res.add(temp);
            return;
        }
        if(open<n){
            func(n,temp+'(',res,open+1,close);
        }
        if(close<open){
           func(n,temp+')',res,open,close+1); 
        }
    }
    public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
    func(n,"",res,0,0);
    return res;
    }
}