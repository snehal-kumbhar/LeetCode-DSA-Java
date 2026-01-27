/* 
Leetcode Question Number = 3668
Name = Restore Finishing Order
Given an integer array order and integer array friends 
order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
Task is to return an array containing your friends' IDs in their finishing order.
*/
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int k=0;
        int d=0;
        while(k<order.length){
            for(int i=0;i<friends.length;i++){
                if(order[k]==friends[i]){
                    ans[d]=order[k];
                    d++;
                }
                
            }
            k++;
        }
        return ans;
    }
}