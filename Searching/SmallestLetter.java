/* 
Leetcode Question Number = 744
Name = Find Smallest Letter Greater Than Target
Given an array of characters named letters sorted in ascending order
Task is to return the smallest char in letters :
which is lexicographically greater than target.
if such char doesn't exist- return first char in letters.
*/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        char ans=letters[0];
        while(s<=e){
            int m=s+(e-s)/2;
            if(letters[m]>target){
                ans=letters[m];
                e=m-1;
            }
            else {
                s=m+1;
            }
        }
        return ans;
    }
}