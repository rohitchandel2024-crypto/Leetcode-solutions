class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    int low=0;
    int high=arr.length-1;
    int mid=0;
    while(low<=high){
       mid=(low+high)/2;
       
       if(arr[mid]<x){
        low=mid+1;
       }
       else{
        high=mid-1;
       }

    }
    List<Integer> list = new ArrayList<>();
    int left=high;
    int right=low;
    while(left>=0 && right<arr.length && k>0){
        if(Math.abs(arr[left]-x)<=Math.abs(arr[right]-x)){
            list.add(arr[left]);
            left--;
        }
        else{
            list.add(arr[right]);
            right++;
        }
        k--;
    }

    while(left>=0 && k>0){
        list.add(arr[left]);
        left--;
        k--;
    }
     while(right<arr.length && k>0){
        list.add(arr[right]);
       right++;
        k--;
    }

    Collections.sort(list);
    return list;

    }
}