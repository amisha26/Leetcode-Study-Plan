Question link : https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/


//Method 1

class Solution {
    public int countOdds(int low, int high) {
        int c=0;
        if(low%2==0){
            for(int i=low+1;i<high;i+=2){
                c+=1;
            }
        }
        else{
            for(int i=low;i<high;i+=2){
                c+=1;
            }
        }
        if(high%2==0){
            return c;
        }
        else{
            return c+=1;
        }
    }
}
