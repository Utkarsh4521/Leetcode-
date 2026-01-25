class Solution{
    public String replaceDigits(String s) {
        StringBuilder gt = new StringBuilder(s);

        for (int i = 1; i < gt.length(); i += 2) {
            char prev = gt.charAt(i - 1);          
            int digit = gt.charAt(i) - '0';        
            char ch = (char)(prev + digit);   
            gt.setCharAt(i, ch);
        }
        return gt.toString();
   }
}
