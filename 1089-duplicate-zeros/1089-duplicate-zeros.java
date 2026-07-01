class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList <Integer> al = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            al.add(arr[i]);
        }
        int read = 0;
        for(int i=0;i<al.size();){
            if(al.get(i)==0){
                al.add(i+1,0);
                al.remove(al.size()-1);
                i= i+2;
            }
            else{
                i++;
            }
        }
        for(int i = 0; i < arr.length; i++){
        arr[i] = al.get(i);}
    }
}