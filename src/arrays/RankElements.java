import java.util.Arrays;
import java.util.HashMap;
public class RankElements {
      public static void main(String[] args) {
            RankElements ob = new RankElements();
            int arr[] = {40,10,20,30};
            int i;
            int ans[] = ob.arrayRankTransform(arr);

            for (i = 0; i < arr.length; i++) {
                  System.out.print(ans[i] + " ");
            }
            System.out.println();
      }

      public int[] arrayRankTransform(int[] arr) {
            HashMap<Integer, Integer> ans = new HashMap<>();
            int i;

            // array is sorted and all the duplicates have been removed
            int sortNoDup[] = Arrays.stream(arr).distinct().sorted().toArray();

            for (i = 0; i < sortNoDup.length; i++) {
                  ans.put(sortNoDup[i], i + 1);
            }

            for (i = 0; i < arr.length; i++) {
                  arr[i] = ans.get(arr[i]);
            }
            return arr;
      }
}
