/*
Leetcode Question Number = 1732
Name = Find the Highest Altitude
Given integer array gain of length n
Task is to return the highest altitude of a point.
*/
class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        for(int i=0;i<gain.length;i++){
            ans[i+1]=gain[i]+ans[i];
        }
        int max=-100;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        return max;
    }
}