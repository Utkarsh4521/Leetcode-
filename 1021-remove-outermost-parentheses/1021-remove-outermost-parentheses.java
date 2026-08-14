class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int dep = 0;
        for(int i = 0 ;i< s.length();i++){
            if(s.charAt(i)=='('){
                if(dep>0){
                    sb.append('(');
                }
                dep++;
            }
            if(s.charAt(i)==')'){
                dep--;
                if(dep>0){
                    sb.append(')');
                }
            }
        }
        String d = sb.toString();
        return d;
    }
}