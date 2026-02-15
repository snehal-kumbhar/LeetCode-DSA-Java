/*
Leetcode Question Number = 67
Name = Add Binary
Given two binary strings a and b.
Task is to return their sum as a binary string.
*/

class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        String ans = "";
        
        while (i >= 0 || j >= 0 || carry == 1) {
            
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            ans = (sum % 2) + ans;  // add at front
            carry = sum / 2;
        }
        
        return ans;
    }
}
