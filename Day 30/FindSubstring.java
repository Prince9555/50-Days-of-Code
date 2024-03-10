public class FindSubstring {
  public static void findSubstring(String str, String ans, int i) {
      if (i == str.length()) {
          if (ans.length() == 0) {
              System.out.println("null");
          } else {
              System.out.println(ans);
          }
          return;
      }

      // Include the current character in the substring
      findSubstring(str, ans + str.charAt(i), i + 1);

      // Exclude the current character from the substring
      findSubstring(str, ans, i + 1);
  }

  public static void main(String[] args) {
      String str = "abc";
      findSubstring(str, "", 0);
  }
}
