/*
Leetcode Question Number = 1295
Name = Find Number with Even Number of Digits
Given array nums of integers
Task is to return how many of them contain even number of digits.
*/
class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
       int ans=0;
       for(int i=0;i<nums.length;i++){
        int n=nums[i];
        while(n>0){
            n=n/10;
            count++;
        }
        if(count%2==0){
            ans++;
        }
        count=0;
       }
    return ans; 
    }
}