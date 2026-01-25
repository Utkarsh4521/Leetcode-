class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char gt = s.charAt(i + 1);

            int h = ch - gt;
            sum += Math.abs(h);
        }

        return sum;
    }
}
