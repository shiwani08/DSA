// package arrays;
import java.util.Arrays;

public class DivisibleByK {
      public static void main(String[] args) {
            DivisibleByK ob = new DivisibleByK();
            int []arr = {1,2,3,4,5,10,6,7,8,9};
            int k = 5;
            boolean ans = ob.canArrange(arr, k);
            System.out.println(ans);
            
      }
      public boolean canArrange(int[] arr, int k) {
            int [] freq = new int[k];
            for(int num: arr){
                int rem = num % k;
                if(rem < 0){
                    rem = rem + k;
                }
                freq[rem]++;
            }
            if(freq[0] % 2 != 0){
                return false;
            }
            for(int i = 1;i <= k / 2;i++){
                if(freq[i] != freq[k-i]) {
                    return false;
                }
            }
            return true;
        }
}
