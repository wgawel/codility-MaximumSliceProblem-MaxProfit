package pl.gawly;

public class Solution {

    public int solution(int[] A) {
        // max slice
        int maxProfit = 0;
        int tempMax = 0;

        for (int i = 1; i < A.length; i++) {
            int diff = A[i] - A[i-1];
            tempMax = Math.max(0, tempMax + diff);
            maxProfit = Math.max(maxProfit, tempMax);
        }

        return maxProfit;
    }
}
