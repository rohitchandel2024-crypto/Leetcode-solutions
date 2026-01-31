class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
     List <int[]> list= new ArrayList<>();
     int n=intervals.length;
     boolean insert=false;
     for(int i=0;i<n;i++){
        int start=intervals[i][0];
        if(insert==false && start>=newInterval[0]){
            list.add(newInterval);
            insert =true;
        }
        list.add(intervals[i]);

     }
     if(!insert){
        list.add(newInterval);
     }

     List <int []> res= new ArrayList<>();
     int start1=list.get(0)[0];
     int end1=list.get(0)[1];
     for(int i=1;i<list.size();i++){
        int start2=list.get(i)[0];
        int end2=list.get(i)[1];
        if(end1>=start2){
            start1=start1;
            end1=Math.max(end1,end2);
            continue;
        }
        res.add(new int [] {start1,end1});
        start1=start2;
         end1=end2;
     }
     res.add(new int[]{start1,end1});
     return res.toArray(new int[res.size()][]);
    }
}