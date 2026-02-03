import java.math.BigInteger;
class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for( int i = 1; i< num.length();i++){
            for(int j=i+1 ; j<num.length(); j++){
                String a = num.substring(0,i);
                String b = num.substring(i,j);
                if(a.length()>1 && a.charAt(0)=='0'||b.length()>1 && b.charAt(0)=='0'){
                    continue;
                }
                BigInteger x = new BigInteger(a);
                BigInteger y = new BigInteger(b);
                int k =j;
                while (k < n) {
                    BigInteger sum = x.add(y);
                    String sumStr = String.valueOf(sum);
                    if (!num.startsWith(sumStr, k)){
                        break;
                    }
                    k += sumStr.length();
                    x = y;
                    y = sum;
                    
                }
                if (k == n)
                    return true;

            }
        }
        return false;
    }
}