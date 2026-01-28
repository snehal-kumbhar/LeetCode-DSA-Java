/* 
Leetcode Question Number = 2942
Name = Find Words Containing Character
You are given a 0-indexed array of strings words and a character x.
Task is to return an array of indices representing the words that contain the character x.
The returned array may be in any order.
*/

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}