class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList <Integer> al = new ArrayList<>();
        int n= nums.length;
        for (int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                al.add(nums[j]);
            }
        }
        int[] arr= new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]= al.get(i);
        }
        return arr;
        
    }
    
}