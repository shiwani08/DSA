class Solution {
    public int longestConsecutive(int[] nums) {
        int largest = 1, curCnt = 1, lastSmall = Integer.MIN_VALUE, i;
       Arrays.sort(nums);

       if(nums.length == 0)
       return 0;

       for (i = 0; i < nums.length; i++) {
            if(nums[i] - 1 == lastSmall) {
                curCnt++;
                lastSmall = nums[i];
            }
            else if(nums[i] != lastSmall) {
                curCnt = 1;
                lastSmall = nums[i];
            }
            largest = Math.max(largest, curCnt);
       }

       return largest;
    }
}