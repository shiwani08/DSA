class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);

        int mid, lower, upper;

        lower = 0;
        upper = nums.length - 1;
        
        while (lower <= upper) {
            mid = (lower + upper) / 2;

            if(nums[mid] < target) {
                lower = mid + 1;
            }

            else if(nums[mid] > target) { 
                upper = mid - 1;
            }

            else {
                return true;
            }
        }

        return false;
    }
}