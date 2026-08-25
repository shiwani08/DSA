class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int i = 1, ans = -1, temp;

        for (int num : nums) {
            if(num % k == 0)
            set.add(num);
        }

        while (set.contains(i * k)) {
            i++;
        }

        ans = i * k;

        return ans;
    }
}