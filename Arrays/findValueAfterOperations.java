/* 
Leetcode Question Number = 2011
Name = Final Value of Variable After Performing Operations
Given an array of strings operations,
Task is to return the final value of variable X after performing all the operations.
*/
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c1=0;
        int c2=0;
        for(String i: operations){
            if (i.equals("++X") || i.equals("X++")){
                c1++;
            }else{
                c2++;
            }
        }
        return c1-c2;
    }
}
