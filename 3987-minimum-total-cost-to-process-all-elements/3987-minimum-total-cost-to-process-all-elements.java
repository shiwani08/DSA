class Solution {
    public int minimumCost(int[] nums, int k) {
        final int MOD = 1_000_000_007;
        long available = k;
        long count = 0; // total refills performed, across the whole run

        for (int num : nums) {
            if (available < num) {
                long deficit = num - available;
                long refillsNeeded = (deficit + k - 1) / k; // ceil(deficit / k)
                available += refillsNeeded * k;
                count += refillsNeeded;
            }
            available -= num;
        }

        // cost = count * (count + 1) / 2  — need this mod (10^9 + 7)
        long half;
        if (count % 2 == 0) {
            half = (count / 2) % MOD;
            half = (half * ((count + 1) % MOD)) % MOD;
        } else {
            half = ((count + 1) / 2) % MOD;
            half = (half * (count % MOD)) % MOD;
        }

        return (int) half;
    }
}