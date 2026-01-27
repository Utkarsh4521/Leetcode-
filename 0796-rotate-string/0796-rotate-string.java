class Solution {
    public boolean rotateString(String s, String goal) {
       String m= s+s;
        if(s.length() != goal.length()){
            return false;
        }
        
    return m.contains(goal);
    }
}