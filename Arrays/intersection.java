/* 
Leetcode Question Number = 349
Name = Intersection of Two Arrays
Given two integer arrays nums1 and nums2,
Task is to return an array of their intersection,
Each element in the result must be unique,
Order of elements does not matter.
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            if (set1.contains(n)) {
                result.add(n);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int n : result) {
            ans[i++] = n;
        }

        return ans;
    }
}
