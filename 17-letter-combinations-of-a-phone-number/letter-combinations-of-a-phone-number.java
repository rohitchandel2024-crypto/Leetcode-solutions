class Solution {
    HashMap<Character,String> map = new HashMap<>();
    void fun(String digits,int n ,int index,String diary,List<String> res){
        if(index==n){
            res.add(diary);
            return;
        }
        String choice = map.get(digits.charAt(index));
        for(int j=0;j<choice.length();j++){
            diary+=choice.charAt(j);
            fun(digits,n,index+1,diary,res);
            diary=diary.substring(0,diary.length()-1);
        }
        return;
    }

    public List<String> letterCombinations(String digits) {
       List<String> res = new ArrayList<>();
       if(digits.length()==0) return res;
       map.put('2',"abc");
       map.put('3',"def");
       map.put('4',"ghi");
       map.put('5',"jkl");
       map.put('6',"mno");
       map.put('7',"pqrs");
       map.put('8',"tuv");
       map.put('9',"wxyz");

       fun(digits,digits.length(),0,"",res);

       return res;
    }
}