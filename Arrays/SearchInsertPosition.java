/*
Leetcode Question Number = 35
Name = Search Insert Position
Given a sorted integer array(distinct), and a target value
Task is to return index where target should be placed
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }    
        return nums.length;
    }
}