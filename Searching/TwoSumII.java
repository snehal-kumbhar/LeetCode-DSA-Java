/*
Leetcode Question Number = 167
Name = Two Sum II= Input Array is Sorted
Given a sorted array of integers and int target
task is to return the indices of two numbers 
(Added by one) as an integer array.
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } 
            else if (sum < target) {
                left++;    
            } 
            else {
                right--;   
            }
        }
        return new int[2]; 
    }
}
