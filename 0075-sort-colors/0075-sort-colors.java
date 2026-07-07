class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);

        int count_zero = 0, count_one = 0, count_two = 0, i = 0, current_index = 0;
        int n = nums.length;
        
        // counting the numbers
        for (i = 0; i < n; i++) {
            if(nums[i] == 0)
            count_zero++;

            else if(nums[i] == 1)
            count_one++;
            
            else
            count_two++;
        }

        // filling zeros
        for (i = 0; i < count_zero; i++) {
            nums[i] = 0;
            current_index++;
        }

        count_one = count_zero + count_one;

        // filling ones
        for (i = current_index; i < count_one; i++) {
            nums[i] = 1;
            current_index++;
        }

        // filling twos
        for (i = current_index; i < n; i++) {
            nums[i] = 2;
        }
    }
}