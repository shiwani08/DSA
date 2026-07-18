class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) 
            continue;

            for (int j = i + 1; j < n - 2; j++) {
                // skip duplicate values for j
                if (j > i + 1 && nums[j] == nums[j - 1]) 
                continue;

                int a = j + 1;
                int b = n - 1;

                while (a < b) {
                    long sum = (long) nums[i] + nums[j] + nums[a] + nums[b];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[a], nums[b]));

                        // skip duplicates for a and b
                        while (a < b && nums[a] == nums[a + 1]) 
                        a++;
                        while (a < b && nums[b] == nums[b - 1]) 
                        b--;

                        a++;
                        b--;
                    } 
                    else if (sum < target) {
                        a++;   // need a bigger sum
                    } 
                    else {
                        b--;   // need a smaller sum
                    }
                }
            }
        }

        return result;
    }
}