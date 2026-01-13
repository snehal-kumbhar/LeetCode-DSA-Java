/* 
Leetcode Question Number = 28
Name = Find the Index of the First Occurence in a String
Given two strings needle and haystack
Task is to return the index of the first occurence of needle in haystack
return -1 if not found
*/
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int m = i;
                int j = 0;
                while (j < needle.length() && haystack.charAt(m) == needle.charAt(j)) {
                    m++;
                    j++;
                }
                if (j == needle.length()) {
                    return i; 
                }
            }
        }
        return -1; 
    }
}
