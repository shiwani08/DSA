class Rotatestring {
  bool rotateString(String s, String goal) {
    int sl = s.length, sg = goal.length, i, f = 0;

    if (sl != sg) return false;

    for (i = 0; i < sl; i++) {
      if (s == goal) {
        return true;
      } else {
        s = s.substring(1) + s[0];
      }
    }
    return false;
  }
}

void main() {
  Rotatestring ob = Rotatestring();
  String s = "abcde", goal = "abced";
  bool ans = ob.rotateString(s, goal);
  print(ans);
}
