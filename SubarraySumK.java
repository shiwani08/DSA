public class SubarraySumK {
    public int subarraySum(int[] nums, int k) {
        int count = 0, i, j, n = nums.length, sum = 0;

        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = i; j < n; j++) {
                sum += nums[j];
                if(sum == k) 
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        SubarraySumK ob = new SubarraySumK();
        int nums[] = {1,1,1};
        int count, k = 2;

        count = ob.subarraySum(nums, k);
        System.out.println("the count is: "+count);
    }
}
