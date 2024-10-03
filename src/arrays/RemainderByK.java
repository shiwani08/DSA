import java.util.HashSet;
public class RemainderByK {
      public static void main(String[] args) {
            RemainderByK ob = new RemainderByK();
            int arr[] = {1,2,3};
            int len = ob.minSubarray(arr, 3);
            System.out.println(len);
      }
      public int add (int arr[]) {
            int sum = 0, i;
            for (i = 0; i < arr.length; i++) {
                  sum += arr[i];
            }
            return sum;
      }
      public int minSubarray(int[] nums, int p) {
            HashSet <Integer> set = new HashSet<>();
            int len = nums.length, i, sum = add(nums), remSum = 0, subSum = 0, start, end;
            if (sum % p == 0)
                  return 0;

            for (start = 0; start < nums.length; start++) {
                  subSum = 0;
                  for (end = start; end < nums.length; end++) {
                        subSum += nums[end];
                        remSum = (sum - subSum) % p;
                        if(remSum == 0) 
                              len = Math.min(len, end - start + 1);
                  }
            }
            
            return (len == nums.length)? -1 : len;
      }
}
