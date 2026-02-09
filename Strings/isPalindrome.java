/* 
Leetcode Question Number = 125
Name = Valid Palindrome
Given a string s,
Task is to return true if it is a palindrome,
Otherwise, return false.
*/
class Solution {
    public boolean isPalindrome(String s) {

        String clean = "";
        
        // Step 1: Keep only letters and numbers, convert to lowercase
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isLetterOrDigit(ch)) {
                clean += Character.toLowerCase(ch);
            }
        }

        // Step 2: Check palindrome
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

