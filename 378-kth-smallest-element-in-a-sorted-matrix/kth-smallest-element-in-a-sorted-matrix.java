class Solution {
    static class Node{
        int val,row,col;
        Node(int v,int r,int c){
            val=v;
            row=r;
            col=c;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
    PriorityQueue <Node> pq=new PriorityQueue<>(
        (a,b)->a.val-b.val
    );

    int n=matrix.length;
    for(int i=0;i<n;i++){
      pq.add(new Node(matrix[i][0],i,0));  
    }

    int res=0;
    while(k-- >0){
        Node curr=pq.poll();
        res=curr.val;

        if(curr.col+1<n){
            pq.add(new Node(matrix[curr.row][curr.col+1],curr.row,curr.col+1));
        }
    }
    return res;
    }
}