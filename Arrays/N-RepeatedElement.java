/*
Leetcode Question Number = 961
Name = N-Repeated Element in Size 2N Array
Given integer array nums with length 2n
Task is to return the element that is repeated n times.
*/
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=(nums.length)/2;
        int count=0;
        for(int i=0;i<2*n;i++){
            for(int j=0;j<2*n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==n){
                return nums[i];
            }
            else{
                count=0;
            }
        }

        return 0;
    }
}