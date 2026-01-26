/* 
Leetcode Question Number = 1200
Name = Minimum Absolute Difference
Given an array of distinct integers arr,
Task is to find all pairs of elements with the minimum absolute difference
and return them in ascending order, where each pair [a, b] satisfies a < b.
*/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>(); 
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])<min){
                min=arr[i+1]-arr[i];
            }
        }
        int k=0;
        int l=0;
        while(k<arr.length-1){
            if(arr[k+1]-arr[k]==min){
                list.add(Arrays.asList(arr[k], arr[k + 1]));
            }
            k++;
        }
        return list;
    }
}