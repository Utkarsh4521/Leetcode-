class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i =0 ;i < letters.length;i++){
            if((int)letters[i]> (int)target){
                return letters[i];
            }
            else continue;
        }
    return letters[0];
    }
}