/* 
Leetcode Question Number = 2089  
Name = Find Target Indices After Sorting Array  
Given a 0-indexed integer array nums and a target element target,  
Task is to sort the array in non-decreasing order and return all indices  
where nums[i] is equal to target.  
*/
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}
