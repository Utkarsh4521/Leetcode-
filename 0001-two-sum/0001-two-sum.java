class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> as = new HashMap<>();
        for(int j=0;j<nums.length;j++){
            int n=target-nums[j];
            if(as.containsKey(n)==true){
                return new int[]{as.get(n),j};
            }
            as.put(nums[j],j);
        }
    return new int[]{};}
}