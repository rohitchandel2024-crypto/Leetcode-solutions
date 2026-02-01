class Pair{
    char first;
    int second;
    Pair(char first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
    int n=s.length();
    Stack<Pair> st=new Stack <>();
    for(int i=0;i<n;i++){
        char curr=s.charAt(i);
        if(st.isEmpty()){
            st.push(new Pair(curr,1));
            continue;
        }
        if(st.peek().first!=curr){
            st.push(new Pair(curr,1));
            continue;
        }
        if(st.peek().second<k-1){
            Pair p=st.pop();
            st.push(new Pair(p.first,p.second+1));
            continue;
        }
        st.pop();
    }
    StringBuilder res=new StringBuilder();
    while(!st.isEmpty()){
        Pair p=st.pop();
        while(p.second-- >0){
            res.append(p.first);
        }
       
    }
     return res.reverse().toString();
    }
}
