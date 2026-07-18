class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();

        // Step 1: add all numbers into the set (removes duplicates automatically)
        for (int num : nums) {
            set.add(num);
        }

        int maxCount = 1;

        // Step 2: only start counting from numbers that begin a sequence
        for (int num : set) {
            // if num - 1 exists, num is NOT the start of a chain, so skip it
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // walk forward as long as consecutive numbers exist
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}