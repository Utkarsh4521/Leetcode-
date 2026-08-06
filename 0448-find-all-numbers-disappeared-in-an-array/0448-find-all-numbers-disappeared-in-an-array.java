class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> al = new HashSet<>();
        List<Integer> as= new ArrayList<>();
        for(int n: nums){
            al.add(n);
        }
        for(int i =1;i<=nums.length;i++){
            if(al.contains(i)==false){
                as.add(i);
            }
        }
        return as;
    }
}