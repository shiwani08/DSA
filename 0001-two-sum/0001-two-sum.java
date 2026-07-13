class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        int n = nums.length, diff = 0, i;

        for (i = 0; i < n; i++) {
            diff = target - nums[i];
            if(map.containsKey(diff)) {
                result[0] = i;
                result[1] = map.get(diff);

                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}