/*
Leetcode Question Number = 2000
Name = Reverse Prefix of a word
Given a string named word and char ch
Task is to reverse the segment of word that 
starts at index 0 and ends at first occurence of ch
*/
class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        char[] ans=new char[n];
        int m=0;
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                m=i+1;
                break;
            }
        }
        for(int j=0;j<m;j++){
            ans[j]=word.charAt(m-1-j);
        }
        for(int k=m;k<n;k++){
            ans[k]=word.charAt(k);
        }
        return new String(ans);
    }
}