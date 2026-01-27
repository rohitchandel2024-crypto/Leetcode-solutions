class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        int n=fruits.length;
        int low=0;
        int res=-1;
        for(int high=0;high<n;high++){
            freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);
            while(freq.size()>2){
                freq.put(fruits[low],freq.getOrDefault(fruits[low],0)-1);
                if(freq.get(fruits[low])==0){
                    freq.remove(fruits[low]);
                    
                }
                low++;
            }
            if(freq.size()<=2){
                res=Math.max(res,high-low+1);
            }
           
        }
        return res;
    }
}