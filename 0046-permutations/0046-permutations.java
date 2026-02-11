class Solution {
    public void back( int[]nums,int start,List<List<Integer>> eww){
        ArrayList<Integer> arr = new ArrayList<>();
        if(start == nums.length){
            for( int n : nums){
                arr.add(n);
            }
            eww.add(arr);
            return;
        }
        for ( int i = start ; i< nums.length;i++){
            swap (nums,start,i);
            back(nums, start+1,eww);
            swap (nums,start,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> re = new ArrayList<>();
        back(nums,0,re);
        return re;
        
    }
    public void swap(int[] a, int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
}