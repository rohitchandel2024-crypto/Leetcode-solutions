class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0, high = arr.length - 1;

     
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }

        int left = high;
        int right = low;

        while (right - left - 1 < k) {
            if (left < 0) {
                right++;              
            } 
            else if (right >= arr.length) {
                left--;                 
            } 
            else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                left--;                
            } 
            else {
                right++;               
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = left + 1; i < right; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
