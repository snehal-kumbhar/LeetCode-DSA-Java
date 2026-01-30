/* 
Leetcode Question Number = 2798  
Name = Number of Employees Who Met the Target  
Given an integer array hours,  
where hours[i] represents the number of hours worked by the i-th employee,  
and an integer target representing the minimum required working hours.  
Task is to count and return the number of employees  
who have worked at least target hours.  
*/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                count++;
            }
        } 
        return count;
    }
}