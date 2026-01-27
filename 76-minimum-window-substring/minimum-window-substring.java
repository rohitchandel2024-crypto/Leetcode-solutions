class Solution {

    private boolean sahi(int[] have, int[] needed) {
        for (int i = 0; i < 256; i++) {
            if (have[i] < needed[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
     

        int[] needed = new int[256];
        int[] have = new int[256];

        // count t
        for (char c : t.toCharArray()) {
            needed[c]++;
        }

        int low = 0;
        int start = 0;
        int res = Integer.MAX_VALUE;

        for (int high = 0; high < s.length(); high++) {
            have[s.charAt(high)]++;

            while (sahi(have, needed)) {
                int len = high - low + 1;
                if (len < res) {
                    res = len;
                    start = low;
                }

                have[s.charAt(low)]--;
                low++;
            }
        }

        return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);
    }
}
