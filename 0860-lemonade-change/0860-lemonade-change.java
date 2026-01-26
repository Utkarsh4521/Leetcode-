class Solution {
    public boolean lemonadeChange(int[] bills) {
        ArrayList <Integer> al= new ArrayList<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                al.add(5);
            }
            else if(bills[i]==10){
                al.add(10);
                if(al.remove(Integer.valueOf(5))!= true){
                    return false;
                }
            }
            else{
                if (al.contains(10) && al.contains(5)) {
                    al.remove(Integer.valueOf(10));
                    al.remove(Integer.valueOf(5));
                }
                else if (Collections.frequency(al, 5) >= 3) {
                    al.remove(Integer.valueOf(5));
                    al.remove(Integer.valueOf(5));
                    al.remove(Integer.valueOf(5));
                }
                else {
                    return false;
                }
            }
        }
    return true;   
    }
}