class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> al = new HashMap<>();
        for(int j=0;j< nums.length;j++){
            int n = target - nums[j];
            if(al.containsKey(n)==true){
                return new int[]{al.get(n),j};
            }
            al.put(nums[j],j);
        }
        return new int[]{};
    }
}



