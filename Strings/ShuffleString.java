/*
Leetcode Question Number = 1528
Name = Shuffle String
Given a string s and int array indices of same length
Task is to shuffle the string s as per indices given
*/
class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] ans=new char[n];
        for(int i=0;i<n;i++){
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);
    }
}