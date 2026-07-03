class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length()-1;
        int count = 0;
        int res = 0;
        int left =0;
        int right = k;
        for(int i = 0;i<right;i++){
            if(isvol(s.charAt(i))){
                count++;
            }
        }
        res = count;
        while(right<=n){
            if(isvol(s.charAt(left))){
                count--;
            }
            if(isvol(s.charAt(right))){
                count++;
            }
            left++;
            right++;
            res = Math.max(res,count);
        }
        
        return res;
    }
    public boolean isvol(char c){
        return c == 'a' ||
            c == 'e' ||
            c == 'i' ||
            c == 'o' ||
            c == 'u';
    }
}