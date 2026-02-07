/* 
Leetcode Question Number = 1385
Name = Find the Distance Value Between Two Arrays
Given two integer arrays arr1 and arr2, and an integer d.
Task is to count elements in arr1 such that for every element in arr2,
the absolute difference is greater than d.
*/
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int x=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    x=-1;
                    break;
                }

            }
            if(x!=-1){
                count++;
            }
            x=0;
        }
        return count;
    }
}