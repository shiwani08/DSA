class Balancedstring {
  bool isBalanced(String num) {
    int i, l = num.length, sumeve = 0, sumodd = 0;

    for (i = 0; i < l; i++) {
      if (i % 2 == 0) {
        sumeve += int.parse(num[i]);
      } else {
        sumodd += int.parse(num[i]);
      }
    }

    if (sumeve == sumodd) return true;
    return false;
  }
}

void main() {
  Balancedstring ob = Balancedstring();
  String num = "24123";
  bool ans = ob.isBalanced(num);
  print(ans);
}
