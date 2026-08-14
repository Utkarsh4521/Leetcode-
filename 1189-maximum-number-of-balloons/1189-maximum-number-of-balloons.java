class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        char[] al= text.toCharArray();
        for(char c : al){
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        int res = Integer.MAX_VALUE;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            if(entry.getKey() == 'l' || entry.getKey()=='o'){
                count = count/2;
            }
            res = Math.min(res,count);
        }
        return res;
    }
}