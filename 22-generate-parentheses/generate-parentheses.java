class Solution {
    void func(int open ,int close,int n ,String temp , List<String> res){
        if(open==n && close ==n){
            res.add(temp);
            return ;
        }
        if(open<n){
            func(open+1,close,n,temp+'(',res);
        }
        if(close<open){
            func(open,close+1,n,temp+')',res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        func(0,0,n,"",res);
        return res;
    }
}