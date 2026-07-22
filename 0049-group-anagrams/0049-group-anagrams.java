class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String , List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            if (map.containsKey(st)==false){
                List<String> ls = new ArrayList<>();
                ls.add(str);
                map.put(st,ls);
            }
            else {
                map.get(st).add(str);
            }
        }
        return new ArrayList<>(map.values());
        }
}