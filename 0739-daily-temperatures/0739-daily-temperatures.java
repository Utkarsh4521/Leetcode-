class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[temperatures.length];
        int n = temperatures.length;
        stk.push(n-1);
        arr[n-1]=0;
        for(int i=n-2;i>=0;i--){
            while(!stk.isEmpty() && temperatures[stk.peek()]<= temperatures[i]){
                int ids = stk.pop();
            }
            if(stk.isEmpty()==true){
                arr[i] = 0;
            }
            else{
                arr[i]=stk.peek()-i;
            }
            stk.push(i);
        }
        return arr;

    }
}