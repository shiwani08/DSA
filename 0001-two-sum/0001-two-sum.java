class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        int n = nums.length, i, j;

        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}