public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i, index = -1, n = nums.length, temp;

        for (i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if(index != -1) {
            for (i = n - 1; i >= index; i--) {
                if(nums[i] > nums[index]) {
                    //swap(nums[i], nums[index])
                    temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            // reverse from index + 1 till length
            index = index + 1;
            n = n - 1;
            reverse(nums, index, n);
        }
        else 
        reverse (nums, 0, n - 1);
    } 
    
    public void reverse (int nums[], int start, int end) {
        int temp;
        while (start <= end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 5, 4, 3, 0, 0};
        int i;
        NextPermutation ob = new NextPermutation();
        ob.nextPermutation(nums);
        for ( i = 0; i < nums.length; i++) 
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}
