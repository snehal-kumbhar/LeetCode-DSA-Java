/*
Leetcode Question Number = 13
Name = Roman to Integer
Given a string s representing a Roman numeral.
Task is to convert the Roman numeral into its
corresponding integer value.
Roman symbols used: I, V, X, L, C, D, M.
*/


class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = getValue(s.charAt(i));
            if (curr < prev) {
                total -= curr;
            } else {
                total += curr;
            }
            prev = curr;
        }
        return total;
    }
    int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000; // M
    }
}
