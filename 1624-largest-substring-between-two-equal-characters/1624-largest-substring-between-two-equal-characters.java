class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int [] ind = new int[26];
        int maxi= -1;
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i)-'a';

            if(ind[idx]>0){
                maxi = Math.max(maxi,i-ind[idx]);
            }
            else{
                ind[idx] =i+1;
            }
        }return maxi;
        
    }
}