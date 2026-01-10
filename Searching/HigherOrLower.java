/*
Leetcode Question Number = 374
Name = Guess Number Higher or Lower
Given a number n, a number is picked between 1 and n (inclusive).
You have to guess the picked number using a predefined API:
int guess(int num)
The API returns:
-1 : if your guess is higher than the picked number  
 1 : if your guess is lower than the picked number  
 0 : if your guess is equal to the picked number  
Task is to return the number that was picked.
*/
public class HigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int s=1;
        int e=n;
        while(s<=e){
            int m=s+(e-s)/2;
            if(guess(m)==-1){
                e=m-1;
            }
            else if(guess(m)==1){
                s=m+1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}