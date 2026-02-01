/* 
Leetcode Question Number = 1684  
Name = Count the Number of Consistent Strings  

Given a string allowed consisting of distinct characters,  
and an array of strings words.  

A string is said to be consistent  
if all characters in the string appear in the string allowed.  

Task is to count and return the number of consistent strings  
present in the array words.  
*/
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];

        for (char ch : allowed.toCharArray()) {
            allowedChars[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean isConsistent = true;

            for (char ch : word.toCharArray()) {
                if (!allowedChars[ch - 'a']) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) count++;
        }

        return count;
    }
}
