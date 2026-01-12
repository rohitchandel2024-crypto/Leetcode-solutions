class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ch=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(ch.empty()){
                ch.push(s.charAt(i));
                continue;
            }
           if (!ch.isEmpty() && ch.peek() == s.charAt(i))
                {
                ch.pop();
                continue;
            }
            ch.push(s.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        while(!ch.isEmpty()){
            res.append(ch.pop());
        }
        return res.reverse().toString();

    }
}