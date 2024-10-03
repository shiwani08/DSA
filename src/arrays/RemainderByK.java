import java.util.HashMap;
public class RemainderByK {
      public static void main(String[] args) {
            RemainderByK ob = new RemainderByK();
            int arr[] = {1000000000,1000000000,1000000000};
            long sum = ob.add(arr);
            System.out.println(sum);
            int len = ob.minSubarray(arr, 3);
            System.out.println(len);
      }
      public long add (int arr[]) {
            long sum = 0; 
            int i;
            for (i = 0; i < arr.length; i++) {
                  sum += arr[i];
            }
            return sum;
      }
      public int minSubarray(int[] nums, int p) {
            HashMap <Long, Integer> modMap = new HashMap<>();
            int n = nums.length, i, len = n;
            long totalSum = add(nums);
            long currentSum = 0, neededSum = 0, target = totalSum % p;

            if (target == 0)
                  return 0;

            modMap.put(0L, -1);
            
            for (i = 0; i < n; i++) {
                  currentSum = (currentSum + nums[i])  % p;
                  neededSum = (currentSum - target + p) % p;

                  if(modMap.containsKey(neededSum)){
                        len = Math.min(len, i - modMap.get(neededSum));
                  }
                  modMap.put(currentSum, i);
            }
            
            return (len == n)? -1 : len;
      }
}
