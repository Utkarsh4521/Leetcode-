class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int p = 0;
        while (p < n - 2 && nums[p] < nums[p + 1]) {
            p++;
        }
        if (p == 0) {
            return false;
        }
        int q = p;
        while (q < n - 1 && nums[q] > nums[q + 1]) {
            q++;
        }
        if (q == p || q == n - 1) {
            return false;
        }
        int m = q;
        while (m < n - 1 && nums[m] < nums[m + 1]) {
            m++;
        }
        return m == n - 1;
    }
}