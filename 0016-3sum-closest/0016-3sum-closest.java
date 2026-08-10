class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int midif = Integer.MAX_VALUE;
        int res= 0;
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                int dif = Math.abs(target-sum);
                if(sum == target){
                    return target;
                }
                else{
                    if(dif< midif) {
                        midif = dif;
                        res = sum;
                        }
                    if(sum<target) left++;
                    else right--;
                }
            }
        }
    return res;}
}