class Solution {
    public int missingNumber(int[] nums) {
        int i, totalSum = 0, sum = 0, n = nums.length, missing;

        totalSum = n * (n + 1) / 2;

        for (i = 0; i < n; i++) {
            sum += nums[i];
        }

        missing = totalSum - sum;
        return missing;
    }
}