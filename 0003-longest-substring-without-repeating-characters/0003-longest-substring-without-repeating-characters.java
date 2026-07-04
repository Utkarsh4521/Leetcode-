class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int res=0,l =0;
        for(int i=l;i<s.length();i++){
            char c = s.charAt(i);
            arr[c]++;
            while(arr[c]>1){
                arr[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res , i-l+1);
        }
        return  res;
    }
}