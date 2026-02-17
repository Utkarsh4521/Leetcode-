class Solution {
    public void bubble(int[]arr){
        int n = arr.length;
        for( int i=0 ; i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swap= true;
                }
                
            }
            if(!swap) return;
        }
    }
    public int majorityElement(int[] nums) {
        bubble(nums);
        int n=nums.length;
        return nums[n/2];
        
    }
}