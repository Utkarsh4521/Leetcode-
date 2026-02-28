class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n==0||s.charAt(0)=='0'){
            return 0;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2;i<=n;i++){
            int one = s.charAt(i-1) -'0';
            if(one>= 1){
                arr[i]+=arr[i-1];
            }
            int two = Integer.parseInt(s.substring(i-2,i));
            if(two>=10 && two<=26){
                arr[i]+= arr[i-2];
            }
        }
        return arr[n];
    }
}