class Solution {
    public void rotate(int[] nums, int k) {
        int l = 0;
        int r = nums.length -1;
        int n= nums.length;
        k = k%n;
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
        int i=0;
        int g= k-1;
        while(i<g){
            swap(nums,i,g);
            i++;
            g--;
        }
        int h = nums.length-1;
        while (k<h){
            swap(nums,k,h);
            k++;
            h--;
        }
        
    }
    public void swap(int[] nums,int l,int r){
         int temp = nums[l];
         nums[l]= nums[r];
         nums[r]= temp;
    }
}