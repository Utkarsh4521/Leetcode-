class Solution {
    public static void paren( int n, int o , int c ,String st,List<String> ut){
        if(c == n){
            ut.add(st);
            return;
        }
        if(o<n){
            paren(n,o+1,c,st+'(',ut);
        }
        if(c<o){
            paren(n,o,c+1,st+')',ut);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> st = new ArrayList<>();
        paren(n,0,0,"",st);
        return st;
    }
}