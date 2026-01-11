/* 
Leetcode Question Number = 704
Name = Binary Search
Given an array of integers nums which is sorted in ascending order, and an integer target
Task is to return index pf target if target exists. Otherwise, return -1.
*/
class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]<target){
                s=m+1;
            }
            else if(nums[m]>target){
                e=m-1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}
