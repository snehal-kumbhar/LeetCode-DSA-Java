/*
Leetcode Question Number = 1431
Name = Kida With the Greatest Number of Candies
Given an integer array candies and integer extraCandies
Task is to return boolean array result such that
result[i]= true when giving ith kid all extraCandies, 
they will have the greatest number of candies among all kids
otherwise false
*/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans =new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
            max=candies[i];}
        }

        for(int j=0;j<candies.length;j++){
            int p=candies[j]+extraCandies;
            if(p>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}