class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n = nums.length;
        int count =0;
        int l =0;
        int res=1;
        for( int r=l;r<n;r++){
            res *= nums[r];
            while(res >=k) {
                res /= nums[l];
                l++;
            }
            count += r-l+1;

        }
        return count;
    }
}