class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0, high = arr.length - 1;

        // lower_bound binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }

        int left = high;
        int right = low;

        // EXPAND window
        while (right - left - 1 < k) {
            if (left < 0) {
                right++;                // ✅ expand right
            } 
            else if (right >= arr.length) {
                left--;                 // ✅ expand left
            } 
            else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                left--;                 // ✅ closer on left
            } 
            else {
                right++;                // ✅ closer on right
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = left + 1; i < right; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
