/* 
Leetcode Question Number = 27
Name = Remove Element
Given an integer array nums and an integer val,
Task is to remove all occurrences of val in-place.
Then return the number of elements in nums which are not equal to val.
*/ 
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
