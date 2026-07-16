class Solution {

    public long findGcd(long a, long b) {
        return b == 0 ? a : findGcd(b, a % b);
    }

    public long gcdSum(int[] nums) {

        int n = nums.length;
        int left = 0, right = n - 1, mx = nums[0], i;
        long sum = 0;

        long prefix[] = new long[n];

        // constructing the prefixgcd
        for (i = 0; i < n; i++) {
            mx = (int)Math.max(mx, nums[i]);
            prefix[i] = findGcd(mx, nums[i]);
        }

        Arrays.sort(prefix);

        while (left < right) {
            sum = sum + findGcd(prefix[left], prefix[right]);
            left++;
            right--;
        }
        return sum;
    }
}