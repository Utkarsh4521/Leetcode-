
class MinStack {
     Stack<Integer> stk = new Stack<>();
     Stack<Integer> mini = new Stack<>();
    public MinStack() {
    }
    
    public void push(int value) {
        stk.push(value);
        if(mini.isEmpty()==true || value<=mini.peek()){
            mini.push(value);
        }
    }
    
    public void pop() {
        if(!stk.isEmpty()){
            int c = stk.pop();
            if(c== mini.peek()){
                mini.pop();
            }
        }

    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */