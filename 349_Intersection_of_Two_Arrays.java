// LeetCode 349: Intersection of Two Arrays
// Difficulty: Easy
// Pattern: Two Pointers + Sorting
// Time Complexity: O(n log n + m log m)
// Space Complexity: O(min(n, m))

import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList <Integer> al = new ArrayList<>();
        int i = 0, j = 0 ;
        while (i< nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if (nums1[i]>nums2[j]){
                j++;
            }
            else {
                if (al.isEmpty() || al.get(al.size() - 1) != nums1[i]){
                al.add(nums1[i]);}
                i++;
                j++;
            }
        }
        int[] result = new int[al.size()];
        for (int k = 0; k < al.size(); k++) {
            result[k] = al.get(k);
        }
        return result;
    }
}
