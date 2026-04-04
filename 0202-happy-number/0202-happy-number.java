class Solution {
    public static int sum(int n){
        int s = 0;
        while (n>0){
            int d=n%10;
            n=n/10;
            s = s+ d*d;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1){
            slow = sum(slow);
            fast = sum(sum(fast));
            if(slow==fast && slow!=1) {
                return false;
            }
        }
        return true;
        
    }
}