class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0], min = nums[0];
        int i = 0, n = nums.length, gcd = 0;

        for (i  = 1; i < n; i++) {
            if(max < nums[i])
                max = nums[i];

            if(min > nums[i])
                min = nums[i];
        }

        for (i = min; i >= 1; i--) {
            if(min % i == 0 && max % i == 0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }
}