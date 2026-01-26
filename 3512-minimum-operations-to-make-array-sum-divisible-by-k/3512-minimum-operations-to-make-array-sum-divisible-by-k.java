class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        int n = nums.length;
        for ( int i=0;i<n;i++){
            sum+=nums[i];
        }
        if (sum%k != 0){
            return sum%k;
        }
        
    return 0;
    }
}