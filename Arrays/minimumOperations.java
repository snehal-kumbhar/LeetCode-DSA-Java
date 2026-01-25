/* 
Leetcode Question Number = 3190
Name = Find Minimum Operations to Make All Elements Divisible by Three
Given an integer array nums,
In one operation, you can add or subtract 1 from any element of nums.
Task is to return the minimum number of operations required to make all elements of nums divisible by 3.
*/

class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        
        for (int num : nums) {
            if (num % 3 != 0) {
                operations++;
            }
        }
        
        return operations;
    }
}
