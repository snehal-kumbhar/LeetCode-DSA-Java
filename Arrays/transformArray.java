/* 
Leetcode Question Number = 3467  
Name = Transform Array by Parity  
Given an integer array nums,  
Task is to replace each even number with 0 and each odd number with 1,  
Then sort the modified array in non-decreasing order and return it.  
*/
class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}