class Solution {
    public int totalFruit(int[] fruits) {
        HashMap <Integer,Integer> mm = new HashMap<>();
        int l= 0;
        int res = 0;
        for(int i=0;i<fruits.length;i++){
            mm.put(fruits[i],mm.getOrDefault(fruits[i],0)+1);
            while(mm.size()>2){
                mm.put(fruits[l], mm.get(fruits[l]) - 1);
                if(mm.get(fruits[l]) == 0) {
                 mm.remove(fruits[l]);
                }   
                l++;
            }
            res = Math.max(res,i-l+1);
        }
    return res;  
    }
}