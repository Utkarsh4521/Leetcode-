class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> ss = new HashMap<>();
        HashMap<Character,Character> ssh= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a= s.charAt(i);
            char b= t.charAt(i);
            if (ss.containsKey(a) && ss.get(a) != b) {
                return false;
            }
            else if (ssh.containsKey(b) && ssh.get(b) != a) {
                return false;
            }
            else{
                ss.put(a,b);
                ssh.put(b,a);
            }
        }
        return true;
    }
}