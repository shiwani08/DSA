import java.util.Arrays;
public class LongestSequence {
    public int longestConsecutive(String[] nums) {
       int i;

       if(nums.length == 0)
       return 0;

       Arrays.sort(nums);

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

    public static void main(String[] args) {
        LongestSequence ob = new LongestSequence();
        String nums[] = {}; // 1 2 3 4 100 200
        int ans = ob.longestConsecutive(nums);
        System.out.println("the length is: "+ans);
    }
}
