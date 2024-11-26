// que link: https://leetcode.com/problems/circular-sentence/

public class circularString {
      public boolean isCircularSentence(String sentence) {
            int i;
            char x;

            for (i = 0; i < sentence.length(); i++) {
                  x = sentence.charAt(i);
                  if(x == ' ') {
                        if(sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                              return false;
                        }
                  }
                  if(sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
                        return false;
            }
            return true;
      }

      public static void main(String[] args) {
            circularString ob = new circularString();
            String sentence = "Leetcode is cool";
            boolean ans = ob.isCircularSentence(sentence);
            System.out.println(ans);
      }
}
