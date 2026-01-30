class Solution {
    public List<String> letterCombinations(String digits) {
        result.clear();
        f(digits,0,"");
        return result;
    }
    public static String map[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> result = new ArrayList<String>();
    private static void f(String arr , int idx,String out){
        if(idx == arr.length()) {
            result.add(out);
            return;
        }
        int digit= arr.charAt(idx)-'0';
        for(int k=0;k< map[digit].length();k++){
            f(arr,idx+1,out+map[digit].charAt(k));
        }
    }

}