/* 
Leetcode Question Number = 1266  
Name = Minimum Time Visiting All Points  
Given n points on a 2D plane: points[i] = [xi, yi].  
Return the minimum time to visit all points in order.  
In 1 second you can move:  
- 1 step horizontally, vertically, or diagonally.  
*/
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=1;i<points.length;i++){
            int x1 = points[i-1][0];
            int y1 = points[i-1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            ans += Math.max(dx, dy);
           }
        return ans;
        }
    }