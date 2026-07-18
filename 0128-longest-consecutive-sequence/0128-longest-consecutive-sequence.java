class Solution {
    public boolean linearSearch(int arr[], int num) {
        int n = arr.length;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == num)
            return true;
        }
        return false;
    }

    public int longestConsecutive(int[] nums) {
        int longest = 1, count = 1, i, x, j;
        int n = nums.length;

        if(n == 0)
        return 0;

        Arrays.sort(nums);

        for (i = 0; i < n - 1; i++) {
            if(nums[i + 1] == nums[i])
                continue;
                
            if(nums[i + 1] == nums[i] + 1)
                count++;
            else 
                count = 1;

            if(longest < count) 
                longest = count;
        }

        return longest;
    }
}