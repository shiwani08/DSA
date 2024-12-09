import java.util.*;
public class palindrome {
      public void reverse(String w, int start, int end) {
            if(start >= end) {
                  System.out.println("Palindrome");
                  return;
            }

            if (w.charAt(start) != w.charAt(end)) {
                  System.out.println("Not a Palindrome");
                  return;
            }
            reverse(w, start + 1, end - 1);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            palindrome ob = new palindrome();
            String w, s;
            System.out.println("Enter a string: ");
            w = sc.nextLine();
            ob.reverse(w, 0, w.length() - 1);
      }
}
