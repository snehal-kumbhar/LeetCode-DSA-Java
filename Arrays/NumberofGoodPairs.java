/*
Leetcode Question Number = 1512
Name = Number of Good Pairs
Given an integer array nums ,
task is to return number of good pairs
pair(i,j) is considered good if 
nums[i]==nums[j] and i<j
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}