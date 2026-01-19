/* 
Leetcode Question Number = 2824  
Name = Count Pairs Whose Sum is Less than Target  
Given a 0-indexed integer array nums of length n and an integer target,  
Task is to return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.  
*/

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                int sum=nums.get(i) + nums.get(j);
                if(sum<target){
                    count++;
                }
            }
        }
        return count;
    }
}