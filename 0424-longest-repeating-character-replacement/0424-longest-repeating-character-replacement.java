class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> h = new HashMap<>();
        int left = 0;
        int mf=0;
        int res = 0;
        for(int i=0 ; i<s.length();i++){
            char c = s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
            mf = Math.max(mf,h.get(c));
            while((i-left+1)-mf >k== true){
                char x = s.charAt(left);
                h.put(x, h.get(x) - 1);
                left++;
            }
            res = Math.max(res , i-left+1);
        }
        return res;
    }
}