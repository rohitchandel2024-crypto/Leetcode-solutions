class Solution {
    int func(int n,int m,int guess){
        int count=0;
        for(int i=1;i<=m;i++){
            count+=Math.min(n,guess/i);

        }
        return count;
    }
    public int findKthNumber(int m, int n, int k) {
     int low=1;
     int res=-1;
     int high=n*m;
     while(low<=high){
        int guess=(low+high)/2;
        int ans=func(n,m,guess);
        if(ans<k){
            low=guess+1;
        }
        else{
            res=guess;
            high=guess-1;
        }
     }
     return res;
    }
}