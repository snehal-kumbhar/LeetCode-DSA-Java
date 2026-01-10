/*
Leetcode Question Number = 278
Name = First Bad Version
Given n version and a api bool isBadVersion(version)  
Task is to return the first bad version 
all version after a bad version are also bad.
*/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (isBadVersion(m)) {
                e = m;      
            } else {
                s = m + 1;  
            }
        }
        return s;
    }
}