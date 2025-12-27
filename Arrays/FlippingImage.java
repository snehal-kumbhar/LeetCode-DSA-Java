/*
Leetcode Question Number = 832
Name = Flipping an Image
Given an nxn binary matrix image ,
task is to flip image horizontally, 
then invert it and return resulting image.
flipping example [1,1,0]-->[0,1,1]
inverting example [0,1,1]-->[1,0,0]
*/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row= image.length;
        int col= image[0].length;

        for(int i=0;i<row;i++){
            int x=0;
            int y=col-1;
            int temp=0;

                while(y>x){
                    temp=image[i][y];
                    image[i][y]=image[i][x];
                    image[i][x]=temp;
                    x=x+1;
                    y=y-1;
                }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else{
                    image[i][j]=1;
                }
            }
        }
        return image;

    }
}
