/* 
Leetcode Question Number = 69
Name = Sqrt(x)
Given a non-negative integer x
Task is to return square root of x rounded to nearest int
*/
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int s=1;
        int e=x;
        int ans=0;
        while(s<=e){
            int m=s+(e-s)/2;
            long sq = (long) m * m;
            if(sq<=x){
                ans=m;
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return ans;
    }
}