/* 
Leetcode Question Number = 350
Name = Intersection of Two Arrays II
Given two integer arrays num1 and num2, 
Task is to return an array of their intersection .
*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    nums2[j] = Integer.MIN_VALUE; // mark as used
                    break;
                }
            }
        }

        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
