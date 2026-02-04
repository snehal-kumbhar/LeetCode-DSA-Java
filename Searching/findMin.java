/* 
Leetcode Question Number = 153
Name = Find Minimum in Rotated Sorted Array
Given a sorted array rotated between 1 and n times,
Task is to find and return the minimum element in the array,
Solution must run in O(log n) time.
*/
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // minimum is in right half
                left = mid + 1;
            } else {
                // minimum is in left half (including mid)
                right = mid;
            }
        }
        return nums[left];
    }
}
