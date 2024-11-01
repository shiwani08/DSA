class fancyString {
      public String makeFancyString(String s) {
          StringBuilder ans = new StringBuilder();
          ans.append(s.charAt(0));
          int n = s.length(), cnt = 1;
          for (int i = 1; i < n; i++) {
              if (s.charAt(i) == ans.charAt(ans.length() - 1)) {
                  cnt++;
                  if (cnt < 3) {
                      ans.append(s.charAt(i));
                  }
              } else {
                  cnt = 1;
                  ans.append(s.charAt(i));
              }
          }
          return ans.toString();
      }
      public static void main(String[] args) {
            fancyString ob = new fancyString();
            String s = "leetcode", ans="";
            ans = ob.makeFancyString(s);
            System.out.println(ans);
      }
  }