/* 
Leetcode Question Number = 1768
Name = Merge Strings Alternately
Given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Task is to return the merged string.
*/
class Solution {
    public String mergeAlternately(String word1, String word2) {

        int x = word1.length();
        int y = word2.length();

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < x || i < y) {

            if (i < x) {
                sb.append(word1.charAt(i));
            }

            if (i < y) {
                sb.append(word2.charAt(i));
            }

            i++;
        }

        return sb.toString();
    }
}
