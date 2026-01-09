/*
Leetcode Question Number = 9
Name = Palindrome Number
Given an integer x.
Task is to return true uf x is a palindrome
else return false if not.
ex. of palindromes= 1221,1234321,41814 etc.
*/
class Solution {
    public boolean isPalindrome(int x) {
        String num=String.valueOf(x);
        int len=num.length();
        for(int i=0;i<len/2;i++){
            if(num.charAt(i)!=num.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
