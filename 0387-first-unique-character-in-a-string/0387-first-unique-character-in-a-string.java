class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> ds = new HashMap<>();
        char[] a =s.toCharArray();
        for(int i=0;i<a.length;i++){
            ds.put(a[i],ds.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<a.length;i++){
            if(ds.get(a[i])==1){
                return i;
            }
        }

    return -1;
    }
}