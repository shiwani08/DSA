import java.util.*;
public class recReverse {
      public void reverse(int start, int end, int arr[]) {
            if(start >= end)
            return;
            else {
                  arr[start] = arr[start] + arr[end];
                  arr[end] = arr[start] - arr[end];
                  arr[start] = arr[start] - arr[end];

                  reverse(start + 1, end - 1, arr);
            } 
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            recReverse ob = new recReverse();
            int n, i;
            System.out.println("Enter size: ");
            n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter elements: ");
            for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

            ob.reverse(0, n - 1, arr);
            for (i = 0; i < n; i++) 
            System.out.print(arr[i] + " ");
            System.out.println();
      }
}
