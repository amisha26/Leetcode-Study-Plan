Question link - https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/


//Method 1
import java.util.Arrays;
import java.lang.Math;

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double s=0;
        double avg;
        int l = salary.length;
        for(int i=1; i<l-1;i++){
            s+=salary[i];
        }
        avg = s/(l-2);
        return avg;
    }
}
