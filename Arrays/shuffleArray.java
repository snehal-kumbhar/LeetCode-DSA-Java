/*
Leetcode Question Number = 1470
Name = Shuffle the Array
Given an integer array nums consisting 2n elements,
in from [x1,x2,x3,...xn,y1,y2,y3,...yn]
The task is to return array in form of:
[x1,y1,x2,y2,x3,y3.....xn,yn]
*/
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans=new int[2*n];
        for(int i=0;i<2*n;i+=2){
            ans[i]=nums[i/2];
        }
        int count=0;
        for(int j=1;j<2*n;j+=2){
            ans[j]=nums[n+count];
            count++;
        }
        return ans;
        

        }
    }
