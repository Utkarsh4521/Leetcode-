class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double res = 0;
        double sum = 0 ;
        int left = 0;
        int right = k-1;
        for(int i = left;i<right+1;i++){
            sum = sum + nums[i];
        }
        res = sum/k;
        while(right+1<n){
            sum = sum - nums[left]+nums[right+1];
            left++;
            right++;
            res =Math.max(res,(sum/k));
        }
    return res;}
}