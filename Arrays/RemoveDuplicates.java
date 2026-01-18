/* 
Leetcode Question Number = 26  
Name = Remove Duplicates from Sorted Array  
Given an integer array nums sorted in non-decreasing order,  
Task is to remove the duplicates in-place such that each unique element appears only once.  
The relative order of the elements should be kept the same.  
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
