class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        for(char c:s.toCharArray()){
            if(c =='(' || c =='{'|| c=='['){
                ss.push(c);
            }
            else if(c ==')'||c=='}'||c==']'){
                if(ss.isEmpty()){
                    return false;
                }
                if(c==')'&& ss.peek()=='('|| c=='}' && ss.peek()== '{' ||c==']' && ss.peek() == '['){
                    ss.pop();
                }
                else{
                    return false;
                }
            }
          
        }
        if(!ss.isEmpty()){
            return false;
        }
        return true;
    }
}