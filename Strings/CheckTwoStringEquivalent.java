/*
Leetcode Question Number = 1662
Name = Check If Two String Arrays are Equivalent
Given two string arrays word1 and word2
Task is to check if two arrays represent the same string
*/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x = String.join("", word1);
        String y = String.join("", word2);
        return x.equals(y);
        }
}