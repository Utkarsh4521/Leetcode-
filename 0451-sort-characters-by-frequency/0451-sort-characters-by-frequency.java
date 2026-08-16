class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> l = new ArrayList<>(map.entrySet());
        Collections.sort(l,(a,b)->b.getValue()-a.getValue());
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: l){
            for(int i=0;i< entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
    return sb.toString();
    }
}