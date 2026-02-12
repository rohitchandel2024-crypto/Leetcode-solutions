class Pair{
    int first;
    int second;
    Pair(int f,int s){
        first=f;
        second=s;
    }

}
    class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->b.first-a.first
        );

        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char key:map.keySet()){
            pq.add(new Pair(map.get(key),key));
        }

        int time=0;
        while(!pq.isEmpty()){
            int cycle=n+1;
            ArrayList<Pair> temp = new ArrayList<>();
            while(cycle>0 && !pq.isEmpty()){
                Pair curr= pq.poll();
                curr.first--;
                time++;
                if(curr.first>0){
                    temp.add(curr);
                }
                cycle--;
            }

            for(Pair p:temp){
                pq.add(p);
            }
            if(!pq.isEmpty()){
                time+=cycle;
            }
        }
    return time;
    }
}