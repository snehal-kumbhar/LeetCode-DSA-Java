/* 
Leetcode Question Number = 34  
Name = Find First and Last Position of Element in Sorted Array  
Given an array of integers nums sorted in non-decreasing order and a target value target,  
Task is to find the starting and ending position of the target in the array.  
If target is not found, return [-1, -1].  
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int s=search(nums, target, true);
        int e=search(nums, target, false);
        ans[0]=s;
        ans[1]=e;
        return ans;
    }
    int search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<nums[mid]){
                e=mid-1;
            }else if(target>nums[mid]){
                s=mid+1;
            }else{
                ans=mid;
                if(findStartIndex){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }

}