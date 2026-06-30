class Solution {
    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int left = 0 ;
        int right = cs.length -1;
        while(left<right){
            if(isvo(cs[left])==false){
                left++;
            }
            else if(!isvo(cs[right])){
                right--;
            }
            else{
                swap(left,right,cs);
                left++;
                right--;
            }
        }
        return String.valueOf(cs);
    }
    public void swap(int l , int r,char[]cs){
        char temp = cs[l];
        cs[l] = cs[r];
        cs[r] = temp;

    }
    public boolean isvo(char c){

    return c=='a' ||
           c=='e' ||
           c=='i' ||
           c=='o' ||
           c=='u' ||
           c=='A' ||
           c=='E' ||
           c=='I' ||
           c=='O' ||
           c=='U';
    }
}
