class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue <Pair> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first)
                return  b.second-a.second;
                return  b.first-a.first;
            }
        );

        for(int i=0;i<arr.length;i++){
            if(pq.size()<k){
            pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            }

            else{
                if(pq.peek().second>Math.abs(arr[i]-x)){
                    pq.poll();
                    pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll().first);
        }
        Collections.sort(list);
        return list;
    }
}