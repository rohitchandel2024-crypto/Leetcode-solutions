class Pair{
    int x;
    int y;
    Pair(int x , int y){
       this.x=x;
       this.y=y;

    }


int dist(){
    return x*x+y*y;
}
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue <>(
            (a,b)->b.dist()-a.dist()
        );

        for(int[] p:points){
            pq.offer(new Pair(p[0],p[1]));

            if(pq.size()>k){
                pq.poll();
            }
        }

        int [][] res= new int [k][2];
        for(int i=0;i<k;i++){
            Pair curr=pq.poll();
            res[i][0]=curr.x;
            res[i][1]=curr.y;
        }
        return res;

    }
}