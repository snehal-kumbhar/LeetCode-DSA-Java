/* 
Leetcode Question Number = 217
Name = Contains Duplicate
Given an integer array nums,
Task is to return true if any value appears at least twice in the array,
and return false if every element is distinct.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num);
        }
        return false;  
    }
}
