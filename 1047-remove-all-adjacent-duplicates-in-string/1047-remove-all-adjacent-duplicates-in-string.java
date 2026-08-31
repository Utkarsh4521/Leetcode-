class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length();i++){
            if(st.isEmpty()==false && st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : st){
            sb.append(c);
        }
        String ff = sb.toString();
        return ff;
    }
}