/* 
Leetcode Question Number = 1095
Name = Find in Mountain Array
Given a mountain array and an integer target,
Task is to return the minimum index where target is found,
If target does not exist, return -1.
*/


 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=0;
        int s=0;
        int e=mountainArr.length()-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)<=mountainArr.get(mid+1)){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        peak=s;
        s=0;
        e=peak; 
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)>target){
                e=mid-1;
            }else if(mountainArr.get(mid)<target){
                s=mid+1;
            }else{
                return mid;
            }
        }
        s=peak;
        e=mountainArr.length()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)>target){
                s=mid+1;
            }else if(mountainArr.get(mid)<target){
                e=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}