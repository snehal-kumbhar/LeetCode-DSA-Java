/* 
Leetcode Question Number = 852  
Name = Peak Index in a Mountain Array  
Given an integer mountain array arr where values increase to a peak element  
and then decrease.  
Task is to find and return the index of the peak element.  
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;//both e and s points to the same element in the end.
    }
}