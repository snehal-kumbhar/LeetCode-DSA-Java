/*
Leetcode Question Number = 367
Name = Valid Perfect Square
Given a positive integer num
Task is to return:
true->if num is a perfect square
false->if num is not a perfect square
*/
class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1;
        int e=num/2;
        if(num==1){
            return true;
        }
        while(s<=e){
            int m=s+(e-s)/2;
            long sq = (long) m * m;
            if(sq<num){
                s=m+1;
            }
            else if(sq>num){
                e=m-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}