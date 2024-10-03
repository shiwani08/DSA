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
            int len = 0;
            int sum = add(nums);
            if (sum % p == 0)
                  return 0;

            set.add(sum % p);
            len = set.size();
            return len;
      }
}
