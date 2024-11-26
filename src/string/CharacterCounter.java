// que link: https://leetcode.com/problems/string-compression-iii/description/

import java.util.HashMap;
class CharacterCounter {
    String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : word.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, 1);
            } else {
                charCount.put(ch, 1);
            }
            result.append(charCount.get(ch)).append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        CharacterCounter ob = new CharacterCounter();
        String word = "mrm";
        String ans = ob.compressedString(word);
        System.out.println(ans);
    }
    
    
}
