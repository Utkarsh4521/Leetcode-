class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length +1;
        Arrays.sort(nums);
        int[] def = new int[n];
        for ( int i =0; i<n;i++){
            def[i]= i;
        }
        for(int j =0;j<nums.length;j++){
            if(def[j]!= nums[j]){
                return j;
            }
        }
    return nums.length;    
    }

}