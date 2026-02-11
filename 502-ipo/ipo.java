class Pair{
    int first;
    int second;
    Pair(int f,int s){
        first=f;
        second=s;
    }
}
    
    class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue <Integer> pq= new PriorityQueue<>(
            (a,b)->b-a
        );
        ArrayList<Pair> arr=new ArrayList<>();
        int n=capital.length;
        for(int i=0;i<n;i++){
            arr.add(new Pair(capital[i],profits[i]));
        }
       Collections.sort(arr,(a,b)->a.first-b.first);
        int idx=0;
        while(k-->0 ){
            while(idx<n){
            if(arr.get(idx).first>w) break;
            pq.add(arr.get(idx).second);
            idx++;
            }

            if(pq.isEmpty()){
                return w;
            }
            w=w+ pq.poll();;
            
        }
           
        
        return w;
    }
}