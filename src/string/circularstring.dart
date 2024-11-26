class Circularstring {
  bool isCircularSentence(String sentence) {
    int i;
    String x;
    for (i = 0; i < sentence.length; i++) {
      x = sentence[i];
      if (x == ' ') {
        if (sentence[i - 1] != sentence[i + 1]) {
          return false;
        }
      }
      if (sentence[0] != sentence[sentence.length - 1]) return false;
    }
    return true;
  }
}

void main() {
    Circularstring ob = Circularstring();
    String sentence = "Leetcode is cool";
    bool ans = ob.isCircularSentence(sentence);
    print(ans);
  }
